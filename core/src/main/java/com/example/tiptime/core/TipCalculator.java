package com.example.tiptime.core;

import java.text.NumberFormat;

public final class TipCalculator {
    private TipCalculator() {}

    public static double calculateTip(double cost, double tipPercentage, boolean roundUp) {
        if (cost <= 0) return 0.0;
        double tip = tipPercentage * cost;
        if (roundUp) {
            tip = Math.ceil(tip);
        }
        return tip;
    }

    public static String formatCurrency(double amount) {
        return NumberFormat.getCurrencyInstance().format(amount);
    }
}
