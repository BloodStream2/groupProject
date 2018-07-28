package pl.sda.javaldz6.project.service;

import pl.sda.javaldz6.project.model.TypesOfMeals;

import java.util.List;

public interface TypesOfMealsService {

    void addTypeOfMeal(String name);

    TypesOfMeals getTypeOfMealById(long typesOfMealsId);

    TypesOfMeals modifyTypeOfMeal(TypesOfMeals typeOfMeal);

    boolean deleteTypeOfMeal(long typesOfMealsId);

    List<TypesOfMeals> getAll();

    TypesOfMeals getRestTypeOfMeal();
}
