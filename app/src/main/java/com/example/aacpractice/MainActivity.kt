package com.example.aacpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navController = findNavController(R.id.navHostFragmentAacPractice)
        setupActionBarWithNavController(navController)
    }

    override fun onSupportNavigateUp()
            = findNavController(R.id.navHostFragmentAacPractice).navigateUp()
}
