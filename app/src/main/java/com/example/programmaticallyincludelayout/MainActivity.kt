package com.example.programmaticallyincludelayout

import android.app.ActionBar
import android.os.Bundle
import android.print.PrintAttributes
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.LinearLayoutCompat
import androidx.core.view.marginTop

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        makeLayout()

    }

    private fun makeLayout() {

        for(i in 0..2) {

            findViewById<LinearLayout>(R.id.toInflateLinearLayout).addView(makeTextView("Texto: $i"))

        }
    }

    private fun makeTextView(text: String): TextView {

        val layoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.WRAP_CONTENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        ).apply {
            this.setMargins(4, 4, 0, 0)
        }

        return TextView(this).apply {
            this.text = text
            this.layoutParams = layoutParams
        }

    }

}