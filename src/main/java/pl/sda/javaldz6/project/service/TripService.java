package pl.sda.javaldz6.project.service;

import pl.sda.javaldz6.project.model.Trip;

import java.util.List;

public interface TripService {


    void addTrip(String name);

    Trip getTripById(int index);

    Trip modifyTrip(int index, Trip trip);

    boolean deleteTrip(int index);

    void init();

    void close();

    List<Trip> getAll();

    Trip getRestTrip();
}
