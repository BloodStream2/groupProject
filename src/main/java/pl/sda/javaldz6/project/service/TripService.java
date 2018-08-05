package pl.sda.javaldz6.project.service;

import pl.sda.javaldz6.project.model.Trip;
import pl.sda.javaldz6.project.model.TripQueryParams;

import java.util.List;

public interface TripService {

    void addTrip(Trip trip);

    Trip getTripById(long tripId);

    Trip modifyTrip(Trip trip);

    boolean deleteTrip(long tripId);

    List<Trip> getAll();

    List<Trip> getTripsByParam(TripQueryParams params);





}
