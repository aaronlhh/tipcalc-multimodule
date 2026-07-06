package com.example.money;

public final class MoneyFormatter {
    private MoneyFormatter() {}

    public static String format(double amount) {
        return String.format("$%.2f", amount);
    }
}
