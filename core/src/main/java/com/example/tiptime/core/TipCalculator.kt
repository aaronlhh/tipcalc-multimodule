/*
 * Copyright (C) 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.tiptime.core

import java.text.NumberFormat
import kotlin.math.ceil

/**
 * Pure business logic for tip calculation.
 * Zero Android imports — JVM testable.
 */
object TipCalculator {

    fun calculateTip(cost: Double, tipPercentage: Double, roundUp: Boolean): Double {
        if (cost <= 0.0) return 0.0
        var tip = tipPercentage * cost
        if (roundUp) {
            tip = ceil(tip)
        }
        return tip
    }

    fun formatCurrency(amount: Double): String {
        return NumberFormat.getCurrencyInstance().format(amount)
    }
}
