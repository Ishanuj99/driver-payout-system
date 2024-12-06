package org.example.service;

import org.example.handler.OfferHandler;
import org.example.model.Driver;

public class PayoutService {
    private PayoutCalculationStrategy calculationStrategy;
    private OfferHandler offerHandler;

    public PayoutService(PayoutCalculationStrategy calculationStrategy, OfferHandler offerHandler) {
        this.calculationStrategy = calculationStrategy;
        this.offerHandler = offerHandler;
    }

    public double calculateFinalPayout(Driver driver) {
        double payout = calculationStrategy.calculatePayout(driver);
        return offerHandler.applyAllOffers(payout);
    }
}

