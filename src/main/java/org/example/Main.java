package org.example;

import org.example.handler.OfferHandler;
import org.example.interfaces.Offer;
import org.example.model.BonusOffer;
import org.example.model.DiscountOffer;
import org.example.model.Driver;
import org.example.repository.OfferRepository;
import org.example.service.DefaultPayoutCalculationStrategy;
import org.example.service.PayoutCalculationStrategy;
import org.example.service.PayoutService;

import java.util.ArrayList;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {

        Driver Ishanuj = new Driver(UUID.randomUUID(), "Ishanuj", "8796543123", 1000.0);

        Offer bonusOffer = new BonusOffer(200);
        Offer discountOffer = new DiscountOffer(15.0);

        OfferRepository offerRepository = new OfferRepository(new ArrayList<>());
        offerRepository.addOffer(bonusOffer);
        offerRepository.addOffer(discountOffer);

        OfferHandler offerHandler = new OfferHandler(offerRepository.getAvailableOffers());

        PayoutCalculationStrategy strategy = new DefaultPayoutCalculationStrategy();
        PayoutService payoutService = new PayoutService(strategy, offerHandler);

        // Calculate final payout
        double finalPayout = payoutService.calculateFinalPayout(Ishanuj);
        System.out.println("Final Payout: Rs." + finalPayout);
    }
}