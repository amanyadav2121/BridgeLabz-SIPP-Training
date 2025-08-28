package com.pranav.streams;

public class InsuranceClaim {
    private final String claimType; // e.g., "HEALTH", "AUTO", "HOME"
    private final double amount;

    public InsuranceClaim(String claimType, double amount) {
        this.claimType = claimType;
        this.amount = amount;
    }

    public String getClaimType() { return claimType; }
    public double getAmount() { return amount; }
}
