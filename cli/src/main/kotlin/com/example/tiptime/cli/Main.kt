package com.example.tiptime.cli

import com.example.tiptime.core.TipCalculator

/**
 * CLI entry point for tip calculation.
 * Usage: MainKt <cost> <tipFraction> [roundUp]
 * Example: 100 0.15 false
 * Note: tipFraction is a fraction like 0.15, not 15.
 */
fun main(args: Array<String>) {
    if (args.size < 2) {
        System.err.println("Usage: <cost> <tipFraction> [roundUp]")
        return
    }
    val cost = args[0].toDoubleOrNull() ?: 0.0
    val tipFraction = args[1].toDoubleOrNull() ?: 0.0
    val roundUp = args.getOrNull(2)?.toBooleanStrictOrNull() ?: false

    val tip = TipCalculator.calculateTip(cost, tipFraction, roundUp)
    val formatted = TipCalculator.formatCurrency(tip)
    println(formatted)
}
