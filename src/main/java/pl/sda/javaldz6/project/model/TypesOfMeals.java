package pl.sda.javaldz6.project.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class TypesOfMeals {
    @Id
    @GeneratedValue
    private Long typesOfMealsId;
    private String name;
    private String description;

    public TypesOfMeals(String name, String description) {
        this.name=name;
        this.description=description;
    }
}
