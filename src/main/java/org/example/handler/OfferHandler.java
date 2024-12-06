package org.example.handler;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.example.interfaces.Offer;

import java.util.List;

@Data
@AllArgsConstructor
public class OfferHandler {
    List<Offer> offers;

    public double applyAllOffers(double payout){
        for(Offer offer: offers){
            payout = offer.applyOffer(payout);
        }
        return payout;
    }
}
