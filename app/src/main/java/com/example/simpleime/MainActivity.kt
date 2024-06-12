package com.example.simpleime

import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import com.example.simpleime.R


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val enableButton: Button = findViewById(R.id.enable_button)
        enableButton.setOnClickListener {
            startActivity(Intent(Settings.ACTION_INPUT_METHOD_SETTINGS))
        }

        val setDefaultButton: Button = findViewById(R.id.set_default_button)
        setDefaultButton.setOnClickListener {
            val imeManager = getSystemService(INPUT_METHOD_SERVICE) as android.view.inputmethod.InputMethodManager
            imeManager.showInputMethodPicker()
        }
    }

}
