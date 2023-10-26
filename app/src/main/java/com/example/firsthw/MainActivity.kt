package com.example.firsthw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firsthw.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setUpName("Aieke")
    }

    private fun setUpName(name: String)
    {
        binding.nameView.text = getString(R.string.hello_my_name, name)
    }
}