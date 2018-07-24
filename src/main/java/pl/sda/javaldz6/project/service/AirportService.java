package pl.sda.javaldz6.project.service;

import pl.sda.javaldz6.project.model.Airport;


import java.util.List;

public interface AirportService {


    void addAirport(String name);

    Airport getAirportById(int index);

    Airport modifyAirport(int index, Airport airport);

    boolean deleteAirport(int index);

    void init();

    void close();

    List<Airport> getAll();

    Airport getRestAirport();
}
