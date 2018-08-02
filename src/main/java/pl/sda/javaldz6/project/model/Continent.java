package pl.sda.javaldz6.project.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Continent {
    @Id
    @GeneratedValue
    private Long continentId;
    private String name;

    public Continent(String name) {
        this.name=name;
    }
}
