package com.example.lab34

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.lab34.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view: ConstraintLayout =binding.root
        setContentView(view)


        binding.textViewName.setOnClickListener {
            binding.textViewName.setTextColor(Color.RED)
        }

        binding.textViewGroup.setOnClickListener {
            binding.textViewGroup.setTextColor(Color.GREEN)
        }

        binding.textViewCity.setOnClickListener {
            binding.textViewCity.setTextColor(Color.BLUE)
        }

        binding.buttonHide.setOnClickListener {
            binding.textViewName.visibility = View.INVISIBLE
        }

        binding.buttonShow.setOnClickListener {
            binding.textViewName.visibility = View.VISIBLE
        }
    }
}
