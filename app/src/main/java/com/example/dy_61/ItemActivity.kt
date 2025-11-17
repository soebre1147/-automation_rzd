package com.example.dy_61

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class ItemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_item)
        val title: TextView = findViewById(R.id.item_list_title_one)
        val Button: Button = findViewById(R.id.item_list_button_one)
        val text1: TextView = findViewById(R.id.item_list_text1)

        title.text = intent.getStringExtra("itemTitle")
        text1.text = intent.getStringExtra("itemText1")



        Button.setOnClickListener{
            val intent = Intent(this, itemsActivity2::class.java)
            startActivity(intent)
        }
    }
}