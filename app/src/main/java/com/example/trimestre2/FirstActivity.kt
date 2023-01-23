package com.example.trimestre2

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.net.Uri
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //El boton para iniciar la llamada
        val callButton = findViewById<Button>(R.id.llamar)
        //numero de telefono al que queremos llamar
        val nro = findViewById<EditText>(R.id.numero)

        callButton.setOnClickListener{
            // creamos un intent que iniciara el telefono
            val intent = Intent(Intent.ACTION_DIAL)
            //rellenamos el intent con el numero de telefono
            intent.data = Uri.parse("telefono:" +nro.text)
            //Lllamamos a la activity telefono
            startActivity(intent)
        }
    }


}



