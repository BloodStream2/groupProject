package pl.sda.javaldz6.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.sda.javaldz6.project.model.Country;
import pl.sda.javaldz6.project.service.CountryService;

import java.util.List;

@Controller
@RequestMapping("/country")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @PostMapping("/add")
    public void addCountry(@RequestBody String name, long continentId) {
        countryService.addCountry(name, continentId);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Country> getCountryById(@PathVariable(name = "id") long countryId){
        Country country = countryService.getCountryById(countryId);
        return ResponseEntity.ok(country);
    }

    @PutMapping("/modify")
    public ResponseEntity<Country> modifyCountry(@RequestBody Country country){
        Country country1 = countryService.modifyCountry(country);
        return ResponseEntity.ok(country1);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteCountry(@PathVariable(name = "id") long countryId){
        boolean country = countryService.deleteCountry(countryId);
        return ResponseEntity.status(200).build();
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Country>> getAll(){
        List<Country> list = countryService.getAll();
        return ResponseEntity.ok(list);

    }
}
