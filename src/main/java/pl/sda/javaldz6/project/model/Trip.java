package pl.sda.javaldz6.project.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Trip {
    @Id
    @GeneratedValue
    private Long tripId;
    @ManyToOne
    @JoinColumn(name = "airportFrom", nullable = false)
    private Airport airportFrom;
    @ManyToOne
    @JoinColumn(name = "airportTo", nullable = false)
    private Airport airportTo;
    @ManyToOne
    @JoinColumn(name = "hotelId", nullable = false)
    private Hotel hotelTo;
    @ManyToOne
    @JoinColumn(name = "cityId", nullable = false)
    private City cityTo;
    private Date departureDate;
    private Date returnDate;
    private int countOfDays;
    @ManyToOne
    @JoinColumn(name = "typesOfMealsId", nullable = false)
    private TypesOfMeals typeOfMeal;
    private double priceForAdult;
    private double priceForChild;
    private double promotion;
    private int countOfAdults;
    private int countOfChildren;
    private String description;

    public Trip(Trip trip) {
        this.airportFrom=trip.getAirportFrom();
        this.airportTo=trip.getAirportTo();
        this.hotelTo=trip.getHotelTo();
        this.cityTo=trip.getCityTo();
        this.departureDate=trip.getDepartureDate();
        this.returnDate=trip.getReturnDate();
        this.countOfDays=trip.getCountOfDays();
        this.typeOfMeal=trip.getTypeOfMeal();
        this.priceForAdult=trip.getPriceForAdult();
        this.priceForChild=trip.getPriceForChild();
        this.promotion=trip.getPromotion();
        this.countOfAdults=trip.getCountOfAdults();
        this.countOfChildren=trip.getCountOfChildren();
        this.description=trip.getDescription();
    }
}
