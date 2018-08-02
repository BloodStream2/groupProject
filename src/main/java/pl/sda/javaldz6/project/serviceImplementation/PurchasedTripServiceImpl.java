package pl.sda.javaldz6.project.serviceImplementation;

import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sda.javaldz6.project.model.PurchasedTrip;
import pl.sda.javaldz6.project.model.Trip;
import pl.sda.javaldz6.project.repository.PurchasedTripJpaRepository;
import pl.sda.javaldz6.project.repository.TripJpaRepository;
import pl.sda.javaldz6.project.service.PurchasedTripService;

import java.util.List;

@Service
public class PurchasedTripServiceImpl implements PurchasedTripService {
    private Logger log;

    @Autowired
    private PurchasedTripJpaRepository purchasedTripRepository;

    @Autowired
    private TripJpaRepository tripRepository;

    @Override
    public void addPurchasedTrip(long tripId, double amount, String owner) {
        Trip trip = tripRepository.findById(tripId).get();
        purchasedTripRepository.save(new PurchasedTrip(trip, amount, owner));
    }

    @Override
    public PurchasedTrip getPurchasedTripById(long purchasedTripId) {
        return purchasedTripRepository.findById(purchasedTripId).get();
    }

    @Override
    public PurchasedTrip modifyPurchasedTrip(PurchasedTrip purchasedTrip) {
        return purchasedTripRepository.save(purchasedTrip);
    }

    @Override
    public boolean deletePurchasedTrip(long purchasedTripId) {
        PurchasedTrip purchasedTrip = getPurchasedTripById(purchasedTripId);
        purchasedTripRepository.delete(purchasedTrip);
        return true;
    }

    @Override
    public List<PurchasedTrip> getAll() {
        return purchasedTripRepository.findAll();
    }
}
