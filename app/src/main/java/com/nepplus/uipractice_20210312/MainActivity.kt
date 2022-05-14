package com.nepplus.uipractice_20210312

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        goBtn.setOnClickListener {
            Toast.makeText(this, "go", Toast.LENGTH_SHORT).show()
        }
    }
}