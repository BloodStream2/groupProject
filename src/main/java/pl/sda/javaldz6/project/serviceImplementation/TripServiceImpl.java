package pl.sda.javaldz6.project.serviceImplementation;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sda.javaldz6.project.model.Trip;
import pl.sda.javaldz6.project.model.TripQueryParams;
import pl.sda.javaldz6.project.repository.TripJpaRepository;
import pl.sda.javaldz6.project.service.TripService;

import java.util.List;

@Service
public class TripServiceImpl implements TripService {
    private Logger log;

    @Autowired
    private TripJpaRepository tripRepository;

    @Override
    public void addTrip(Trip trip) {
        tripRepository.save(new Trip(trip));

    }

    @Override
    public Trip getTripById(long tripId) {
        return tripRepository.findById(tripId).get();
    }

    @Override
    public Trip modifyTrip(Trip trip) {
        return tripRepository.save(trip);
    }

    @Override
    public boolean deleteTrip(long tripId) {
        Trip trip = getTripById(tripId);
        tripRepository.delete(trip);
        return true;
    }

    @Override
    public List<Trip> getTripsByParam(TripQueryParams params){
        return tripRepository.getTripsByParam(params);
    }
    @Override
    public List<Trip> getAll() {
        return tripRepository.findAll();
    }
}
