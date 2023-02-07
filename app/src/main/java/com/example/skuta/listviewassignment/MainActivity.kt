package com.example.skuta.listviewassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    lateinit var gamesList: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gamesList = findViewById(R.id.games_list)

        val games = arrayListOf<String>("League of Legends","Valorant","Counter-Strike","Overwatch","Guilty Gear","Super Smash Bros.","Yu-Gi-Oh","PUBG","World of Warcraft","Starcraft","Call of Duty","Minecraft","Diablo","Magic: The Gathering","Street Fighter")
        val gamesAdapter: ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_list_item_1,games)

        gamesList.adapter = gamesAdapter
    }
}