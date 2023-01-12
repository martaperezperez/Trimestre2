package com.example.trimestre2

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class secondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second2)

      // val changeButton = findViewById<Button>(R.id.button2)

      //  changeButton.setOnClickListener(){
          //  val intent = Intent(this, FirstActivity::class.java)
          //  startActivity(intent)
      //  }

        val intent = getIntent()

        val value = intent.getIntExtra("clientes", 0)
        val numclientes = findViewById<TextView>(R.id.textView2)

        numclientes.text = value.toString()

        intent.putExtra("saludo" , "Hola");
        Log.d("MENSAJE","actualizado inernet")

        setResult(Activity.RESULT_OK, intent);
        Log.d("MENSAJE","actualizado resultado")
        finish()



    }
}