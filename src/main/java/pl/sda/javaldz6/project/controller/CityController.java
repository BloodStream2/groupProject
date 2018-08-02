package pl.sda.javaldz6.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import pl.sda.javaldz6.project.model.City;
import pl.sda.javaldz6.project.service.CityService;

import java.util.List;

@Service
@RequestMapping("/city")
public class CityController {

    @Autowired
    private CityService cityService;


    @PostMapping("/add")
    public void addCity(@RequestBody String name, long countryId){
        cityService.addCity(name, countryId);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<City> getCityById(@PathVariable(name = "id") long cityId){
        City city = cityService.getCityById(cityId);
        return ResponseEntity.ok(city);
    }

    @PutMapping("/modify")
    public ResponseEntity<City> modifyCity(@RequestBody City city){
        City city1 = cityService.modifyCity(city);
        return ResponseEntity.ok(city1);

    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteCity(@PathVariable(name = "id") long cityId){
        Boolean city = cityService.deleteCity(cityId);
        return ResponseEntity.status(200).build();
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<City>> getAll(){
        List<City> list = cityService.getAll();
        return ResponseEntity.ok(list);
    }

}
