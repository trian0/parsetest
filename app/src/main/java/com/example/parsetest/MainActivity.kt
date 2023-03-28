package com.example.parsetest

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.parse.ParseObject

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val saveButton = findViewById<Button>(R.id.save_button);

        saveButton.setOnClickListener {
            val gameScore = ParseObject("GameScore")
                gameScore.put("score", 1337)
                gameScore.put("playerName", "Sean Plott")
                gameScore.put("cheatMode", false)
                gameScore.saveInBackground {
                    Log.d("DEBUG", "Game Score saved, id: " + gameScore.get("score"))
                }
        }
    }
}