package pl.sda.javaldz6.project.serviceImplementation;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sda.javaldz6.project.model.Continent;
import pl.sda.javaldz6.project.model.Country;
import pl.sda.javaldz6.project.repository.ContinentJpaRepository;
import pl.sda.javaldz6.project.repository.CountryJpaRepository;
import pl.sda.javaldz6.project.service.CountryService;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {
    private Logger log;

    @Autowired
    private CountryJpaRepository countryRepository;

    @Autowired
    private ContinentJpaRepository continentRepository;

    @Override
    public void addCountry(String name, long continentId) {
        Continent continent = continentRepository.findById(continentId).get();
        countryRepository.save(new Country(name, continent));

    }

    @Override
    public Country getCountryById(long countryId) {
        return countryRepository.findById(countryId).get();
    }

    @Override
    public Country modifyCountry(Country country) {
        return countryRepository.save(country);
    }

    @Override
    public boolean deleteCountry(long countryId) {
        Country country = getCountryById(countryId);
        countryRepository.delete(country);
        return true;
    }

    @Override
    public List<Country> getAll() {
        return countryRepository.findAll();
    }
}
