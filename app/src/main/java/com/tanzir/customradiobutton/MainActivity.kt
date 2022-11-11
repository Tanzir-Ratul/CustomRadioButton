package com.tanzir.customradiobutton

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import worker8.com.github.radiogroupplus.RadioGroupPlus

class MainActivity : AppCompatActivity() {
    // Initialize variable
    lateinit var radioGroupPlus: RadioGroupPlus
    lateinit var btReset: Button
    lateinit var btSubmit: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
// Assign variable
        radioGroupPlus = findViewById(R.id.radio_group);
        btReset = findViewById(R.id.bt_reset);
        btSubmit = findViewById(R.id.bt_submit);

        btReset.setOnClickListener {


            // Clear check
            radioGroupPlus.clearCheck();
        }


        btSubmit.setOnClickListener {

            // get started radio button id
            val id = radioGroupPlus.checkedRadioButtonId;
            // Check condition
            when (id) {
                R.id.radio_button1 -> { // When id is equal to button
                    // initialize string
                    val s: String = "One";
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

            }
        }

        radioGroupPlus.setOnCheckedChangeListener()
        { group:RadioGroupPlus,checkedId:Int->
                // When check the radio button
                // Display toast
                displayToast("Selected Id " + checkedId);
            }

    }

    private fun displayToast(s: String) {
        // Initialize toast
        Toast.makeText(
            applicationContext, s, Toast.LENGTH_SHORT
        ).show();
    }
}
