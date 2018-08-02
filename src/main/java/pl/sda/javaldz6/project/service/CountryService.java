package pl.sda.javaldz6.project.service;

import pl.sda.javaldz6.project.model.Country;

import java.util.List;

public interface CountryService {

    void addCountry(String name, long continentId);

    Country getCountryById(long countryId);

    Country modifyCountry(Country country);

    boolean deleteCountry(long countryId);

    List<Country> getAll();

}
