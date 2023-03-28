package com.example.parsetest

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.parse.Parse
import com.parse.ParseObject

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Parse.initialize(
            Parse.Configuration.Builder(this)
                .applicationId("qawsedrftg123")
                .clientKey("KEYTHALES")
                .server("http://localhost:1337/parse/")
                .build()
        )

        val saveButton = findViewById<Button>(R.id.save_button);
        val titulo = findViewById<EditText>(R.id.edit_titulo).text;
        val descricao = findViewById<EditText>(R.id.edit_descricao).text;

        saveButton.setOnClickListener{
            val test = ParseObject("Test")
            test.put("Titulo", "Titulo")
            test.put("Descricao", "Descrição")
            test.saveInBackground{
                Log.d("SAVE", "Objeto salvo com sucesso " + test.objectId)
            }
        }
    }
}