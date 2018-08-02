package pl.sda.javaldz6.project.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class City {

    @Id
    @GeneratedValue
    private Long cityId;

    private String name;
    @ManyToOne
    @JoinColumn(name = "countryId", nullable = false)
    private Country countryId;

    public City(String name, Country country) {
        this.name=name;
        this.countryId=country;
    }
}
