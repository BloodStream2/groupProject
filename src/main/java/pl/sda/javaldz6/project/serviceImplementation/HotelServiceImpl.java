package pl.sda.javaldz6.project.serviceImplementation;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sda.javaldz6.project.model.City;
import pl.sda.javaldz6.project.model.Hotel;
import pl.sda.javaldz6.project.repository.CityJpaRepository;
import pl.sda.javaldz6.project.repository.HotelJpaRepository;
import pl.sda.javaldz6.project.service.HotelService;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelService {
private Logger log;

@Autowired
private HotelJpaRepository hotelRepository;

@Autowired
private CityJpaRepository cityRepository;

    @Override
    public void addHotel(String name, double standard, String desctiption, long cityId) {
        City city = cityRepository.findById(cityId).get();
        hotelRepository.save(new Hotel(name, standard, desctiption, city));
    }

    @Override
    public Hotel getHotelById(long hotelId) {
        return hotelRepository.findById(hotelId).get();
    }

    @Override
    public Hotel modifyHotel(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public boolean deleteHotel(long hotelId) {
        Hotel hotel = getHotelById(hotelId);
        hotelRepository.delete(hotel);
        return true;
    }

    @Override
    public List<Hotel> getAll() {
        return hotelRepository.findAll();
    }
}
