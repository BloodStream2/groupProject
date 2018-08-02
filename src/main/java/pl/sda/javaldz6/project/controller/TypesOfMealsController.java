package pl.sda.javaldz6.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import pl.sda.javaldz6.project.model.TypesOfMeals;
import pl.sda.javaldz6.project.service.TypesOfMealsService;

import java.util.List;

@Service
@RequestMapping("/meals")
public class TypesOfMealsController {

    @Autowired
    private TypesOfMealsService typesOfMealsService;

    @PostMapping("/add")
    public void addTypeOfMeal(@RequestBody String name, String description){
        typesOfMealsService.addTypeOfMeal(name, description);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<TypesOfMeals> getTypeOfMealById(@PathVariable(name = "id") long typesOfMealsId){
        TypesOfMeals typesOfMeals = typesOfMealsService.getTypeOfMealById(typesOfMealsId);
        return ResponseEntity.ok(typesOfMeals);
    }

    @PutMapping("/modify")
    public ResponseEntity<TypesOfMeals> modifyTypeOfMeal(@RequestBody TypesOfMeals typeOfMeal){
        TypesOfMeals typeOfMeal1 = typesOfMealsService.modifyTypeOfMeal(typeOfMeal);
        return ResponseEntity.ok(typeOfMeal1);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteTypeOfMeal(@PathVariable(name = "id") long typesOfMealsId){
        Boolean typesOfMeals = typesOfMealsService.deleteTypeOfMeal(typesOfMealsId);
        return ResponseEntity.status(200).build();
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<TypesOfMeals>> getAll(){
        List<TypesOfMeals> list = typesOfMealsService.getAll();
        return ResponseEntity.ok(list);
    }

}
