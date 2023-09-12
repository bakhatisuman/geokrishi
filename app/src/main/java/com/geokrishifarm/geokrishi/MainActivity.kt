package com.geokrishifarm.geokrishi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geokrishifarm.crop_health_query.CropHealthActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        goToCropHealthActivity()
    }


    private fun goToCropHealthActivity(){

        val intent = Intent(this@MainActivity, CropHealthActivity::class.java)
        startActivity(intent)
    }
}