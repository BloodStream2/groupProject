package pl.sda.javaldz6.project.service;

import pl.sda.javaldz6.project.model.Hotel;

import java.util.List;

public interface HotelService {


    void addHotel(String name);

    Hotel getHotelById(int index);

    Hotel modifyHotel(int index, Hotel hotel);

    boolean deleteHotel(int index);

    void init();

    void close();

    List<Hotel> getAll();

    Hotel getRestHotel();
}
