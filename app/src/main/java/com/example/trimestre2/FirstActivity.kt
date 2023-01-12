package com.example.trimestre2

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.TextView

class FirstActivity : AppCompatActivity() {

    val RESULTADO_UNO = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var goSecond = findViewById<Button>(R.id.button)

        goSecond.setOnClickListener{
            // Crear un Intent para iniciar la segunda acividad
            val intent = Intent(this, secondActivity::class.java)

            //Añade datos adicionale al Intent
            intent.putExtra("proveedores","2")
            intent.putExtra("clientes", 3)

            //Iniciar la segunda actividad
            startActivityForResult(intent, RESULTADO_UNO)

        }

    }
    @Deprecated("Deprecated in Java")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?){
        super.onActivityResult(requestCode, resultCode, data)

       val saludo = findViewById<TextView>(R.id.textView3)
        if(resultCode != Activity.RESULT_OK)return
        when(requestCode){
            RESULTADO_UNO -> {
                if(data != null) {
                    saludo.text=data.getStringExtra("saludo")
                }
            }
            else -> {}
        }
    }

}



