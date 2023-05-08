package com.example.newswave.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.newswave.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class NewsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)

        val bottomNavigationView : BottomNavigationView = findViewById(R.id.bottomNavigationView)
        val newsNavHostFragment : View? = findViewById(R.id.newsNavHostFragment)

        if (newsNavHostFragment != null) {
            bottomNavigationView.setupWithNavController(newsNavHostFragment.findNavController())
        }
    }
}