package com.example.tiptime.core;

public final class TipResult {
    private final double amount;
    private final String formatted;

    public TipResult(double amount, String formatted) {
        this.amount = amount;
        this.formatted = formatted;
    }

    public double getAmount() {
        return amount;
    }

    public String getFormatted() {
        return formatted;
    }
}
