package pl.sda.javaldz6.project.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Airport {
    @Id
    @GeneratedValue
    private Long airportId;
    private String name;
    @ManyToOne
    @JoinColumn(name = "cityId", nullable = false)
    private City cityId;
}
