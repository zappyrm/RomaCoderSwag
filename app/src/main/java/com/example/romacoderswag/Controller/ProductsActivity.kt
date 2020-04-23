package com.example.romacoderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.romacoderswag.R
import com.example.romacoderswag.Utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        println(categoryType)

    }
}
