package org.example.repository;

import lombok.AllArgsConstructor;
import org.example.interfaces.Offer;

import java.util.List;

@AllArgsConstructor
public class OfferRepository {
    private List<Offer> availableOffers;
    public void addOffer(Offer offer){
        availableOffers.add(offer);
    }

    public List<Offer> getAvailableOffers(){
        return availableOffers;
    }
}
