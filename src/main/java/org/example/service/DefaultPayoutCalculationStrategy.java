package org.example.service;

import org.example.model.Driver;

public class DefaultPayoutCalculationStrategy implements PayoutCalculationStrategy {
    @Override
    public double calculatePayout(Driver driver){
        return driver.getTotalEarnings();
    }
}
