package pl.sda.javaldz6.project.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class PurchasedTrip {
    @Id
    @GeneratedValue
    private Long purchasedTripId;
    @ManyToOne
    @JoinColumn(name = "tripId", nullable = false)
    private Trip trip;
    private double amount;
    private String owner;
}
