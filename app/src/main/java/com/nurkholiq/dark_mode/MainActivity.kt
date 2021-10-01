package com.nurkholiq.dark_mode

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.switchmaterial.SwitchMaterial

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.title = "Dark Mode"


        val switchMaterial = findViewById<SwitchMaterial>(R.id.switch_material)
        val buttonSample = findViewById<Button>(R.id.btn_sample)


        buttonSample.setOnClickListener {
            startActivity(Intent(this,NewActivity::class.java))
        }
    }
}