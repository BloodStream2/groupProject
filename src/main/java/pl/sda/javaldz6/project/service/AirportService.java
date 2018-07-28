package pl.sda.javaldz6.project.service;

import pl.sda.javaldz6.project.model.Airport;


import java.util.List;

public interface AirportService {

    void addAirport(String name, long cityId);

    Airport getAirportById(long airportId);

    Airport modifyAirport(Airport airport);

    boolean deleteAirport(long airportId);

    List<Airport> getAll();

    Airport getRestAirport();
}
