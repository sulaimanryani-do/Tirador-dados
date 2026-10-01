package org.insbaixcamp.frases

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    var numero1: Int = 0
    var numero2: Int = 0
    val randomNum1 = (1..6).random()
    val randomNum2 = (1..6).random()
    var total: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {

        var buto: Button = findViewById(R.id.btmove)
        var image1: ImageView = findViewById(R.id.image1)
        var image2: ImageView = findViewById(R.id.image2)
        var tvnum1: TextView = findViewById(R.id.tvnum1)
        var tvnum2: TextView = findViewById(R.id.tvnum2)
        var tvtotal: TextView = findViewById(R.id.tvtotal)

        buto.setOnClickListener {


            when(randomNum1){

                1-> image1.setBackgroundResource(R.drawable.num1)
                2-> image1.setBackgroundResource(R.drawable.num2)
                3-> image1.setBackgroundResource(R.drawable.num3)
                4-> image1.setBackgroundResource(R.drawable.num4)
                5-> image1.setBackgroundResource(R.drawable.num5)
                6-> image1.setBackgroundResource(R.drawable.num6)


            }

            when(randomNum2){

                1-> image2.setBackgroundResource(R.drawable.num1)
                2-> image2.setBackgroundResource(R.drawable.num2)
                3-> image2.setBackgroundResource(R.drawable.num3)
                4-> image2.setBackgroundResource(R.drawable.num4)
                5-> image2.setBackgroundResource(R.drawable.num5)
                6-> image2.setBackgroundResource(R.drawable.num6)

            }

            numero1 = randomNum1
            numero2 = randomNum2
            tvnum1.text = numero1.toString()
            tvnum2.text = numero2.toString()
            total = randomNum1 + randomNum2
            tvtotal.text = total.toString()

        }
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.Image)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

}