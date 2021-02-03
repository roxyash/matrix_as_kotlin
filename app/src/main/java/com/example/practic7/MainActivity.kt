package com.example.practic7

import android.content.pm.ActivityInfo
import android.content.res.Configuration
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        button.setOnClickListener{
            val number1 = findViewById<EditText>(R.id.editText1).text.toString()!!.toInt()
            val number2 = findViewById<EditText>(R.id.editText2).text.toString()!!.toInt()
            val number3 = findViewById<EditText>(R.id.editText3).text.toString()!!.toInt()
            val number4 = findViewById<EditText>(R.id.editText4).text.toString()!!.toInt()
            val number5 = findViewById<EditText>(R.id.editText5).text.toString()!!.toInt()
            val number6 = findViewById<EditText>(R.id.editText6).text.toString()!!.toInt()
            val number7 = findViewById<EditText>(R.id.editText7).text.toString()!!.toInt()
            val number8 = findViewById<EditText>(R.id.editText8).text.toString()!!.toInt()
            val number9 = findViewById<EditText>(R.id.editText9).text.toString()!!.toInt()

            val determinant = number1 * ((number5*number9)+((number6*number8)*-1)) - number7*((number4*number9)+((number7*number6)*-1)) + number3*((number4*number8)+((number7*number5)*-1))
            val minor1 = (number5*number9)-(number8*number6)
            val minor2 = ((number4*number9)-(number7*number6))*-1
            val minor3 = (number4*number8)-(number7*number5)
            val minor4 = ((number2*number9)-(number3*number8))*-1
            val minor5 = (number1*number9)-(number3*number7)
            val minor6 = ((number1*number8)-(number2*number7))*-1
            val minor7 = (number2*number6)-(number3*number5)
            val minor8 = ((number1*number6)-(number3*number4))*-1
            val minor9 = (number1*number5)-(number2*number4)
            if (determinant!=0)
            {
                text1.text = (minor1*-1).toString()
                text2.text = (minor4*-1).toString()
                text3.text = (minor7*-1).toString()
                text4.text = (minor2*-1).toString()
                text5.text = (minor5*-1).toString()
                text6.text = (minor8*-1).toString()
                text7.text = (minor3*-1).toString()
                text8.text = (minor6*-1).toString()
                text9.text = (minor9*-1).toString()
            }
            else
            {
                text10.text = "Обратной матрицы не существует"
            }


        }
    }
}