package pl.sda.javaldz6.project.service;

import pl.sda.javaldz6.project.model.TypesOfMeals;

import java.util.List;

public interface TypesOfMealsService {

    void addTypeOfMeal(String name, String description);

    TypesOfMeals getTypeOfMealById(long typesOfMealsId);

    TypesOfMeals modifyTypeOfMeal(TypesOfMeals typeOfMeal);

    boolean deleteTypeOfMeal(long typesOfMealsId);

    List<TypesOfMeals> getAll();

}
