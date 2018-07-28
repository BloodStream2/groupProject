package pl.sda.javaldz6.project.service;

import pl.sda.javaldz6.project.model.Hotel;

import java.util.List;

public interface HotelService {

    void addHotel(String name, long cityId);

    Hotel getHotelById(long hotelId);

    Hotel modifyHotel(Hotel hotel);

    boolean deleteHotel(long hotelId);

    List<Hotel> getAll();

    Hotel getRestHotel();
}
