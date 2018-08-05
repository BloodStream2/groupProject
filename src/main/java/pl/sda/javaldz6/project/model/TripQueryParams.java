package pl.sda.javaldz6.project.model;

import lombok.Data;

import java.util.Date;

@Data
public class TripQueryParams {

    private Double priceAdult;
    private Double priceChild;
    private Airport airportFrom;
    private Airport airportTo;
    private Hotel hotelTo;
    private City cityTo;
    private Date departureDate;
    private Date returnDate;
    private Integer countOfDays;
}
