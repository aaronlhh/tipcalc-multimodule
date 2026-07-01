package com.example.tiptime.ui

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.TextView

/**
 * Reusable compound view displaying tip result in stylized way.
 * Owned by ui module to justify separate Android library.
 */
class TipResultView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    private val textView: TextView

    init {
        orientation = VERTICAL
        LayoutInflater.from(context).inflate(R.layout.view_tip_result, this, true)
        textView = findViewById(R.id.tip_value)
    }

    fun setTipAmount(formatted: String) {
        textView.text = context.getString(R.string.tip_amount, formatted)
    }
}
