package com.example.tiptime.cli;

import com.example.tiptime.core.TipCalculator;

public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("Usage: <cost> <tipFraction> [roundUp]");
            return;
        }
        double cost = Double.parseDouble(args[0]);
        double tipFraction = Double.parseDouble(args[1]);
        boolean roundUp = args.length > 2 && Boolean.parseBoolean(args[2]);
        System.out.println(TipCalculator.formatCurrency(TipCalculator.calculateTip(cost, tipFraction, roundUp)));
    }
}
