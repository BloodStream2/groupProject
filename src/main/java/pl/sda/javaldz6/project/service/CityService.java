package pl.sda.javaldz6.project.service;

import pl.sda.javaldz6.project.model.City;

import java.util.List;

public interface CityService {

    void addCity(String name);

    City getCityById(int index);

    City modifyCity(int index, City city);

    boolean deleteCity(int index);

    void init();

    void close();

    List<City> getAll();

    City getRestCity();
}
