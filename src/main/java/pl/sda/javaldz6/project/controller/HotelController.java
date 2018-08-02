package pl.sda.javaldz6.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import pl.sda.javaldz6.project.model.Hotel;
import pl.sda.javaldz6.project.service.HotelService;

import java.util.List;

@Service
@RequestMapping("/hotel")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @PostMapping("/add")
    public void addHotel(@RequestBody String name, double standard, String desctiption, long cityId){
        hotelService.addHotel(name, standard, desctiption, cityId);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Hotel> getHotelById(@PathVariable(name = "id") long hotelId){
        Hotel hotel = hotelService.getHotelById(hotelId);
        return ResponseEntity.ok(hotel);
    }

    @PostMapping("/modify")
    public ResponseEntity<Hotel> modifyHotel(@RequestBody Hotel hotel){
        Hotel hotel1 = hotelService.modifyHotel(hotel);
        return ResponseEntity.ok(hotel1);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteHotel(@PathVariable(name = "id") long hotelId){
        Boolean hotel = hotelService.deleteHotel(hotelId);
        return ResponseEntity.status(200).build();
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Hotel>> getAll(){
        List<Hotel> list = hotelService.getAll();
        return ResponseEntity.ok(list);
    }
}
