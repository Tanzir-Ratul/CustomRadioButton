package com.tanzir.customradiobutton

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.content.res.ResourcesCompat
import worker8.com.github.radiogroupplus.RadioGroupPlus

class MainActivity : AppCompatActivity() {
    // Initialize variable
    lateinit var radioGroupPlus: RadioGroupPlus
    lateinit var btReset: Button
    lateinit var btSubmit: Button
    private lateinit var layout1: LinearLayout
    private lateinit var layout2: LinearLayout
    private lateinit var layout3: LinearLayout
    private lateinit var layout4: LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
// Assign variable
        radioGroupPlus = findViewById(R.id.radio_group);
        btReset = findViewById(R.id.bt_reset);
        btSubmit = findViewById(R.id.bt_submit);
        layout1 = findViewById(R.id.ll1)
        layout2 = findViewById(R.id.ll2)
        layout3 = findViewById(R.id.ll3)
        layout4 = findViewById(R.id.ll4)
        btReset.setOnClickListener {


            // Clear check
            radioGroupPlus.clearCheck();
        }


        // Check condition
        /*  when (radioGroupPlus.checkedRadioButtonId) {
              R.id.radio_button1 -> {
                  val s: String = "One";
                  //layout.setBackgroundResource((R.drawable.shape_radio_button_bg_blue))
                  //layout.background =  ResourcesCompat.getDrawable(resources,R.drawable.shape_radio_button_bg_blue,theme)
                  //layout.setBackgroundColor(Color.parseColor("#ff0000"))
                  // Display toast
                  displayToast(s);
              }

              R.id.radio_button2 -> { // When id is equal to button
                  // Display toast
                  displayToast("Two");
              }

              R.id.radio_button3 -> {// When id is equal to button
                  // Display toast
                  displayToast("Three");
              }

              R.id.radio_button4 -> {  // When id is equal to button
                  // Display toast
                  displayToast("Four");
              }

          }*/


        radioGroupPlus.setOnCheckedChangeListener()
        { group: RadioGroupPlus, checkedId: Int ->
            // When check the radio button
            // Display toast
            when (radioGroupPlus.checkedRadioButtonId) {
                R.id.radio_button1 -> {

                    layout1.setBackgroundResource((R.drawable.shape_radio_button_bg_blue))
                    layout2.setBackgroundResource((R.drawable.shape_radio_custom_button))
                    layout3.setBackgroundResource((R.drawable.shape_radio_custom_button))
                    layout4.setBackgroundResource((R.drawable.shape_radio_custom_button))
                    //layout.background =  ResourcesCompat.getDrawable(resources,R.drawable.shape_radio_button_bg_blue,theme)
                    //layout.setBackgroundColor(Color.parseColor("#ff0000"))


                }

                R.id.radio_button2 -> { // When id is equal to button
                    layout2.setBackgroundResource((R.drawable.shape_radio_button_bg_blue))
                    layout1.setBackgroundResource((R.drawable.shape_radio_custom_button))
                    layout3.setBackgroundResource((R.drawable.shape_radio_custom_button))
                    layout4.setBackgroundResource((R.drawable.shape_radio_custom_button))
                }

                R.id.radio_button3 -> {// When id is equal to button
                    layout3.setBackgroundResource((R.drawable.shape_radio_button_bg_blue))
                    layout1.setBackgroundResource((R.drawable.shape_radio_custom_button))
                    layout2.setBackgroundResource((R.drawable.shape_radio_custom_button))
                    layout4.setBackgroundResource((R.drawable.shape_radio_custom_button))
                }

                R.id.radio_button4 -> {  // When id is equal to button
                    layout4.setBackgroundResource((R.drawable.shape_radio_button_bg_blue))
                    layout1.setBackgroundResource((R.drawable.shape_radio_custom_button))
                    layout2.setBackgroundResource((R.drawable.shape_radio_custom_button))
                    layout3.setBackgroundResource((R.drawable.shape_radio_custom_button))
                }

            }

        }

    }

    private fun displayToast(s: String) {
        // Initialize toast
        Toast.makeText(
            applicationContext, s, Toast.LENGTH_SHORT
        ).show();
    }
}
