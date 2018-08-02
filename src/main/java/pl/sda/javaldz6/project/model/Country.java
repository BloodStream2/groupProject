package pl.sda.javaldz6.project.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Country {

    @Id
    @GeneratedValue
    private Long countryId;

    private String name;
    @ManyToOne
    @JoinColumn(name = "continentId", nullable = false)
    private Continent continentId;

    public Country(String name, Continent continent) {
        this.name=name;
        this.continentId=continent;
    }
}
