package pl.sda.javaldz6.project.service;

import pl.sda.javaldz6.project.model.PurchasedTrip;

import java.util.List;

public interface PurchasedTripService {


    void addPurchasedTrip(String name);

    PurchasedTrip getPurchasedTripById(int index);

    PurchasedTrip modifyPurchasedTrip(int index, PurchasedTrip purchasedTrip);

    boolean deletePurchasedTrip(int index);

    void init();

    void close();

    List<PurchasedTrip> getAll();

    PurchasedTrip getRestPurchasedTrip();
}
