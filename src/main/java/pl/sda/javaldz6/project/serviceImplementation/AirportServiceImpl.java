package pl.sda.javaldz6.project.serviceImplementation;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sda.javaldz6.project.model.Airport;
import pl.sda.javaldz6.project.model.City;
import pl.sda.javaldz6.project.repository.AirportJpaRepository;
import pl.sda.javaldz6.project.repository.CityJpaRepository;
import pl.sda.javaldz6.project.service.AirportService;

import java.util.List;

@Service
public class AirportServiceImpl implements AirportService {
    private Logger log;

    @Autowired
    private AirportJpaRepository airportRepository;

    @Autowired
    private CityJpaRepository cityRepository;

    @Override
    public void addAirport(String name, long cityId) {
        City city = cityRepository.findById(cityId).get();
        airportRepository.save(new Airport(name, city));
    }

    @Override
    public Airport getAirportById(long airportId) {
        return airportRepository.findById(airportId).get();
    }

    @Override
    public Airport modifyAirport(Airport airport) {
        return airportRepository.save(airport);
    }

    @Override
    public boolean deleteAirport(long airportId) {
        Airport airport = getAirportById(airportId);
        airportRepository.delete(airport);
        return true;
    }

    @Override
    public List<Airport> getAll() {
        return airportRepository.findAll();
    }
}
