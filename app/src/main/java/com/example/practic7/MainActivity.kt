package com.example.practic7

import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.practic7.Add.Companion.calculateDeterminant
import com.example.practic7.Add.Companion.minorEight
import com.example.practic7.Add.Companion.minorFive
import com.example.practic7.Add.Companion.minorFourth
import com.example.practic7.Add.Companion.minorNine
import com.example.practic7.Add.Companion.minorOne
import com.example.practic7.Add.Companion.minorSeven
import com.example.practic7.Add.Companion.minorSix
import com.example.practic7.Add.Companion.minorThree
import com.example.practic7.Add.Companion.minorTwo
import kotlinx.android.synthetic.main.activity_main.*

class Add private constructor(){
    companion object{
        fun minorOne(number5:Int,number9:Int,number8:Int, number6:Int):Int{
            return (number5*number9)-(number8*number6)
        }
        fun minorTwo(number4:Int,number9:Int,number7:Int, number6:Int):Int{
            return ((number4*number9)-(number7*number6))*-1
        }
        fun minorThree(number5:Int,number4:Int,number8:Int, number7:Int):Int{
            return (number4*number8)-(number7*number5)
        }
        fun minorFourth(number2:Int,number9:Int,number8:Int, number3:Int):Int{
            return ((number2*number9)-(number3*number8))*-1
        }
        fun minorFive(number1:Int,number9:Int,number3:Int, number7:Int):Int{
            return (number1*number9)-(number3*number7)
        }
        fun minorSix(number1:Int,number2:Int,number8:Int, number7:Int):Int{
            return ((number1*number8)-(number2*number7))*-1
        }
        fun minorSeven(number5:Int,number2:Int,number3:Int, number6:Int):Int{
            return (number2*number6)-(number3*number5)
        }
        fun minorEight(number1:Int,number3:Int,number4:Int, number6:Int):Int{
            return ((number1*number6)-(number3*number4))*-1
        }
        fun minorNine(number5:Int,number1:Int,number2:Int, number4:Int):Int{
            return (number1*number5)-(number2*number4)
        }


        fun calculateDeterminant(number1:Int,number2:Int,number3:Int,number4:Int,number5:Int,number6:Int,number7:Int,number8:Int,number9:Int):Int{
            return number1 * ((number5*number9)+((number6*number8)*-1)) - number7*((number4*number9)+((number7*number6)*-1)) + number3*((number4*number8)+((number7*number5)*-1))
        }


    }
}

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

              val minor1 = minorOne(number5,number9,number8, number6)
              val minor2 = minorTwo(number4,number9,number7,number6)
              val minor3 = minorThree(number5,number4,number8,number7)
              val minor4 = minorFourth(number2,number9,number8,number3)
              val minor5 = minorFive(number1,number9,number3,number7)
              val minor6 = minorSix(number1,number2,number8,number7)
              val minor7 = minorSeven(number5,number2,number3,number6)
              val minor8 = minorEight(number1,number3,number4,number6)
              val minor9 = minorNine(number5,number1,number2,number4)
              val determinant = calculateDeterminant(number1,number2,number3,number4,number5,number6,number7,number8,number9)
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