package pl.sda.javaldz6.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.sda.javaldz6.project.model.PurchasedTrip;
import pl.sda.javaldz6.project.service.PurchasedTripService;

import java.util.List;

@Controller
@RequestMapping("/purchasedTrip")
public class PurchasedTripController {

    @Autowired
    private PurchasedTripService purchasedTripService;

    @PostMapping("/add")
    public void addPurchasedTrip(@RequestBody long tripId, double amount, String owner){
        purchasedTripService.addPurchasedTrip(tripId, amount, owner);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<PurchasedTrip> getPurchasedTripById(@PathVariable(name = "id") long purchasedTripId){
        PurchasedTrip purchasedTrip1 = purchasedTripService.getPurchasedTripById(purchasedTripId);
        return ResponseEntity.ok(purchasedTrip1);
    }
    @PutMapping("/modify")
    public ResponseEntity<PurchasedTrip> modifyPurchasedTrip(@RequestBody PurchasedTrip purchasedTrip){
        PurchasedTrip newPurchasedTrip = purchasedTripService.modifyPurchasedTrip(purchasedTrip);
        return ResponseEntity.ok(newPurchasedTrip);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deletePurchasedTrip(@PathVariable(name = "id") long purchasedTripId){
        boolean purchasedTrip = purchasedTripService.deletePurchasedTrip(purchasedTripId);
        return ResponseEntity.status(200).build();
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<PurchasedTrip>> getAll(){
        List<PurchasedTrip> purchasedTripList = purchasedTripService.getAll();
        return ResponseEntity.ok(purchasedTripList);
    }
}
