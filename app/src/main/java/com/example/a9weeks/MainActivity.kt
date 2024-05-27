package com.example.a9weeks

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.a9weeks.R
import com.example.a9weeks.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.navigation.itemIconTintList = null
        binding.navigation.setOnItemSelectedListener {
            when(it.itemId){
                R.id.menu_home -> {
                    supportFragmentManager.beginTransaction().replace(R.id.main_frm, Home()).commit()
                    return@setOnItemSelectedListener true
                }
                R.id.menu_search -> {
                    supportFragmentManager.beginTransaction().replace(R.id.main_frm, Search()).commit()
                    return@setOnItemSelectedListener true
                }
                R.id.menu_create -> {
                    supportFragmentManager.beginTransaction().replace(R.id.main_frm, Create()).commit()
                    return@setOnItemSelectedListener true
                }
                R.id.menu_reels -> {
                    supportFragmentManager.beginTransaction().replace(R.id.main_frm, Reels()).commit()
                    return@setOnItemSelectedListener true
                }
                R.id.menu_profile -> {
                    supportFragmentManager.beginTransaction().replace(R.id.main_frm, Profile()).commit()
                    return@setOnItemSelectedListener true
                }
                else -> {
                    return@setOnItemSelectedListener true
                }
            }
        }

        binding.mainFrm.setOnClickListener {  }


        binding.navigation.selectedItemId = R.id.menu_home
    }
}

