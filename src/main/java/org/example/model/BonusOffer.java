package org.example.model;

import lombok.AllArgsConstructor;
import org.example.interfaces.Offer;

@AllArgsConstructor
public class BonusOffer implements Offer {
    private int bonusAmount;
    @Override
    public double applyOffer(double payoutPrice) {
        return payoutPrice + bonusAmount;
    }
}
