package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.example.interfaces.Offer;

@Data
@AllArgsConstructor
public class Payout {
    private Driver driver; //driver associated with payout
    private double payoutAmount;

    public void applyOffer(Offer offer){
        payoutAmount = offer.applyOffer(payoutAmount);
    }
}
