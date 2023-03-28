package com.example.parsetest

import android.app.Application
import android.util.Log
import com.parse.Parse
import com.parse.ParseObject

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        Parse.initialize(
            Parse.Configuration.Builder(this)
                .applicationId("qawsedrftg123")
                .clientKey("KEYTHALES")
                .server("http://localhost:1337/parse")
                .build()
        )
    }
}