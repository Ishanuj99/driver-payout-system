package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.example.interfaces.Offer;

@AllArgsConstructor
@Data
public class DiscountOffer implements Offer {
    private double discountPercentage;
    @Override
    public double applyOffer(double payoutPrice) {
        if(discountPercentage > 100){
            throw new RuntimeException("Discount percentage cannot exceed 100");
        }
        return payoutPrice - (discountPercentage * payoutPrice) /100.0;
    }
}
