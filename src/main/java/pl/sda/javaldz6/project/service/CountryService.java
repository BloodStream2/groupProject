package pl.sda.javaldz6.project.service;

import pl.sda.javaldz6.project.model.Country;

import java.util.List;

public interface CountryService {
    void addCountry(String name);

    Country getCountryById(int index);

    Country modifyCountry(int index, Country country);

    boolean deleteCountry(int index);

    void init();

    void close();

    List<Country> getAll();

    Country getRestCountry();
}
