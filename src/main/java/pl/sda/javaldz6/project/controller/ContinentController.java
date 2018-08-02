package pl.sda.javaldz6.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.sda.javaldz6.project.model.Continent;
import pl.sda.javaldz6.project.service.ContinentService;

import java.util.List;
@RestController
@RequestMapping("/continent")
public class ContinentController {
    @Autowired
    private ContinentService continentService;

    @PostMapping("/add")
    public void addContinent(@RequestBody String name){
        continentService.addContinent(name);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Continent> getContinentById(@PathVariable(name = "id") long continentId){
        Continent continent = continentService.getContinentById(continentId);
        return ResponseEntity.ok(continent);
    }

    @PutMapping("/modify")
    public ResponseEntity<Continent> modifyContinent(@RequestBody Continent continent){
        Continent newContinent = continentService.modifyContinent(continent);
        return ResponseEntity.ok(newContinent);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteContinent(@PathVariable(name = "id") long continentId){
        Boolean continent = continentService.deleteContinent(continentId);
        return ResponseEntity.status(200).build();
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Continent>> getAll(){
        List<Continent> list = continentService.getAll();
        return ResponseEntity.ok(list);
    }
}
