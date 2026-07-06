package com.example.tiptime.service;

import com.example.tiptime.core.TipCalculator;
import com.example.tiptime.core.TipResult;

public final class TipService {
    private TipService() {}

    public static TipResult compute(double cost, double tipFraction, boolean roundUp) {
        double amount = TipCalculator.calculateTip(cost, tipFraction, roundUp);
        String formatted = TipCalculator.formatCurrency(amount);
        return new TipResult(amount, formatted);
    }
}
