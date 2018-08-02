package pl.sda.javaldz6.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import pl.sda.javaldz6.project.model.Airport;
import pl.sda.javaldz6.project.service.AirportService;

import java.util.List;

@Service
@RequestMapping("/airport")
public class AirportController {

    @Autowired
    private AirportService airportService;

    @PostMapping("/add")
    public void addAirport(@RequestBody String name, long cityId) {
        airportService.addAirport(name, cityId);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Airport> getAirportById(@PathVariable(name = "id") long airportId) {
        Airport airport = airportService.getAirportById(airportId);
        return ResponseEntity.ok(airport);
    }

    @PostMapping("/modify")
    public ResponseEntity<Airport> modifyAirport(@RequestBody Airport airport) {
        Airport airport1 = airportService.modifyAirport(airport);
        return ResponseEntity.ok(airport1);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteAirport(@PathVariable(name = "id") long airportId){
        Boolean airport = airportService.deleteAirport(airportId);
        return ResponseEntity.status(200).build();
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Airport>> getAll(){
        List<Airport> list = airportService.getAll();
        return ResponseEntity.ok(list);
    }
}
