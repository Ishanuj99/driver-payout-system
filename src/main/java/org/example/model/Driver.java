package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
public class Driver {
    private UUID driverId;
    private String name;
    private String phoneNumber;
    private double totalEarnings;

    public void addEarnings(double amount){
        totalEarnings+= amount;
    }
}
