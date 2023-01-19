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


        //Recoge el Intent que ha iniciado la actividad
        val intent = getIntent()

        //Recoge el valor de tipo String pasado en el Intent
        val nro1 = intent.getIntExtra("nro1", 0)
        val nro2 = intent.getIntExtra("nro2",0)


        //Metodo un nuevo dato en el intent
        intent.putExtra("suma" , nro1 + nro2);

        //Debug
        Log.d("MENSAJE","actualizado inernet")

        //Configuro el result para que la Main lo tenga disponible
        //Posibles resultados:
        //  Activity.RESULT_OK
        //  Activity.RESULT_CANCELED

        setResult(Activity.RESULT_OK, intent);
        //Debug
        Log.d("MENSAJE","actualizado resultado")
        //cierro la activity
        finish()



    }
}