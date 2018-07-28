package pl.sda.javaldz6.project.service;

import pl.sda.javaldz6.project.model.Trip;

import java.util.Date;
import java.util.List;

public interface TripService {

//    void addTrip(long airportFromId, long airportToId, long hotelId, long cityId, Date departureDate, Date returnDate, int countOfDays, long typesOfMealsId, );

    void addTrip(Trip trip);

    Trip getTripById(long tripId);

    Trip modifyTrip(Trip trip);

    boolean deleteTrip(long tripId);

    List<Trip> getAll();

    Trip getRestTrip();
}
