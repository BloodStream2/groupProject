package pl.sda.javaldz6.project.service;

import pl.sda.javaldz6.project.model.TypesOfMeals;

import java.util.List;

public interface TypesOfMealsService {



    void addTypeOfMeal(String name);

    TypesOfMeals getTypeOfMealById(int index);

    TypesOfMeals modifyTypeOfMeal(int index, TypesOfMeals typeOfMeal);

    boolean deleteTypeOfMeal(int index);

    void init();

    void close();

    List<TypesOfMeals> getAll();

    TypesOfMeals getRestTypeOfMeal();
}
