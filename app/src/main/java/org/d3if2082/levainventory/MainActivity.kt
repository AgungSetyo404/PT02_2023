package org.d3if2082.levainventory

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.d3if2082.levainventory.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.fragment_mainmenu)

//    supportFragmentManager.beginTransaction().replace(R.id.mainmenuFragment, MainmenuFragment()).commit()
    }
}