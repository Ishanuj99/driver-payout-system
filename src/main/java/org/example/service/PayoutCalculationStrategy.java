package org.example.service;

import org.example.model.Driver;

public interface PayoutCalculationStrategy {
    public double calculatePayout(Driver driver);
}
