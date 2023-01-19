package com.example.trimestre2

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.TextView

class FirstActivity : AppCompatActivity() {

    val RESULTADO_UNO = 1
    val RESULTADO_DOS = 2
    val RESULTADO_TRES = 3

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var goSecond = findViewById<Button>(R.id.button)

        goSecond.setOnClickListener{
            // Crear un Intent para iniciar la segunda acividad
            val intent = Intent(this, secondActivity::class.java)

            //Añade numeros al intent
            intent.putExtra("nro1",2)
            intent.putExtra("nro2", 3)

            //Iniciar la segunda actividad
            startActivityForResult(intent, RESULTADO_UNO)

            //lo mismo para las otras llamadas
            intent.putExtra("nro1",4)
            intent.putExtra("nro2",4)
            //iniciar la segunda actividad
            startActivityForResult(intent,RESULTADO_DOS)
            intent.putExtra("nro1",6)
            intent.putExtra("nro2",10)
            //Iniciar la tercera actividad
            startActivityForResult(intent, RESULTADO_TRES)



        }

    }
    @Deprecated("Deprecated a partir de API 30")

    //recoje el internet cuando hacemos setResult() en la SecondActivity
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?){
        super.onActivityResult(requestCode, resultCode, data)
        //Definimos el text view para mostrar el dato que nos manda la Second

        val suma1 = findViewById<TextView>(R.id.suma1)
        val suma2 = findViewById<TextView>(R.id.suma2)
        val suma3 = findViewById<TextView>(R.id.suma3)

        //Comprueba que el resultado es OK
        if(resultCode != Activity.RESULT_OK || data == null)return
        //Puedo distinguir diferentes acciones segun el requestCode
        when(requestCode){
            RESULTADO_UNO -> {
                suma1.text = data.getIntExtra("suma", 0).toString()
                 }
            RESULTADO_DOS -> {
                suma2.text = data.getIntExtra("suma",0).toString()
            }
            RESULTADO_TRES -> {
                suma3.text = data.getIntExtra("suma",0).toString()
            }
            else -> {
            }

        }
    }

}



