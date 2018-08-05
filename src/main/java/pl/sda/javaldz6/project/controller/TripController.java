package pl.sda.javaldz6.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.sda.javaldz6.project.model.Trip;
import pl.sda.javaldz6.project.model.TripQueryParams;
import pl.sda.javaldz6.project.service.TripService;

import java.util.List;

@Controller
@RequestMapping("/trip")
public class TripController {

    @Autowired
    private TripService tripService;

    @PostMapping("/add")
    public void addTrip(@RequestBody Trip trip){
        tripService.addTrip(trip);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Trip> getTripById(@PathVariable(name = "id") long tripId){
        Trip trip = tripService.getTripById(tripId);
        return ResponseEntity.ok(trip);
    }

    @PutMapping("/modify")
    public ResponseEntity<Trip> modifyTrip(@RequestBody Trip trip){
        Trip newTrip = tripService.modifyTrip(trip);
        return ResponseEntity.ok(newTrip);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteTrip(@PathVariable(name = "id") long tripId){
        Boolean trip = tripService.deleteTrip(tripId);
        return ResponseEntity.status(200).build();
    }

    @PostMapping("/getByParam")
    public ResponseEntity<List<Trip>> getTripsByParam(@RequestBody TripQueryParams params){
        List<Trip> tripList = tripService.getTripsByParam(params);
        return ResponseEntity.ok(tripList);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Trip>> getAll(){
        List<Trip> tripList = tripService.getAll();
        return ResponseEntity.ok(tripList);
    }


}
