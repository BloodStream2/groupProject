package pl.sda.javaldz6.project.serviceImplementation;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sda.javaldz6.project.model.City;
import pl.sda.javaldz6.project.model.Country;
import pl.sda.javaldz6.project.repository.CityJpaRepository;
import pl.sda.javaldz6.project.repository.CountryJpaRepository;
import pl.sda.javaldz6.project.service.CityService;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {
    private Logger log;

    @Autowired
    private CityJpaRepository cityRepository;

    @Autowired
    private CountryJpaRepository countryRepository;


    @Override
    public void addCity(String name, long countryId) {
        Country country = countryRepository.findById(countryId).get();
        cityRepository.save(new City(name, country));
    }

    @Override
    public City getCityById(long cityId) {
        return cityRepository.findById(cityId).get();
    }

    @Override
    public City modifyCity(City city) {
        return cityRepository.save(city);
    }

    @Override
    public boolean deleteCity(long cityId) {
        City city = getCityById(cityId);
        cityRepository.delete(city);
        return true;
    }

    @Override
    public List<City> getAll() {
        return cityRepository.findAll();
    }
}
