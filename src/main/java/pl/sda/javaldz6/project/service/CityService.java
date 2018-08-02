package pl.sda.javaldz6.project.service;

import pl.sda.javaldz6.project.model.City;

import java.util.List;

public interface CityService {

    void addCity(String name, long countryId);

    City getCityById(long cityId);

    City modifyCity(City city);

    boolean deleteCity(long cityId);

    List<City> getAll();

}
