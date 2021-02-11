package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val clickableViews: List<View> =
            listOf(
                box_one_text,
                box_two_text,
                box_three_text,
                box_four_text,
                box_five_text,
                box_six_text,
                constraint_layout,
                red_button,
                green_button,
                yellow_button,
                pink_button
            )
        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }

    private fun makeColored(view: View): Unit = when (view) {
        box_one_text -> view.setBackgroundColor(Color.DKGRAY)
        box_two_text -> view.setBackgroundColor(Color.GRAY)
        box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
        box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
        box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)
        box_six_text -> view.setBackgroundResource(android.R.color.holo_red_light)
        red_button -> box_three_text.setBackgroundResource(R.color.my_red_color)
        yellow_button -> box_four_text.setBackgroundResource(R.color.my_yellow_color)
        green_button -> box_five_text.setBackgroundResource(R.color.my_green_color)
        pink_button -> box_six_text.setBackgroundResource(R.color.my_pink_color)
        else -> view.setBackgroundColor(Color.LTGRAY)
    }
}
