package pl.sda.javaldz6.project.service;

import pl.sda.javaldz6.project.model.PurchasedTrip;
import pl.sda.javaldz6.project.model.Trip;

import java.util.List;

public interface PurchasedTripService {

    void addPurchasedTrip(long tripId, double amount, String owner);

    PurchasedTrip getPurchasedTripById(long purchasedTripId);

    PurchasedTrip modifyPurchasedTrip(PurchasedTrip purchasedTrip);

    boolean deletePurchasedTrip(long purchasedTripId);

    List<PurchasedTrip> getAll();
}
