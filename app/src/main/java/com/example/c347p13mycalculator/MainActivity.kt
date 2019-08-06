package com.example.c347p13mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var value = ""
    var value1 = ""
    var total = 0.0
    var operator = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnOnClick(view: View) {
        val btnSelected = view as Button

        if(tvCalculate.text.toString() == "0") {

            tvCalculate.text = ""

            when(btnSelected.id){
                btn0.id -> tvCalculate.text = tvCalculate.text.toString() + "0"
                btn1.id -> tvCalculate.text = tvCalculate.text.toString() + "1"
                btn2.id -> tvCalculate.text = tvCalculate.text.toString() + "2"
                btn3.id -> tvCalculate.text = tvCalculate.text.toString() + "3"
                btn4.id -> tvCalculate.text = tvCalculate.text.toString() + "4"
                btn5.id -> tvCalculate.text = tvCalculate.text.toString() + "5"
                btn6.id -> tvCalculate.text = tvCalculate.text.toString() + "6"
                btn7.id -> tvCalculate.text = tvCalculate.text.toString() + "7"
                btn8.id -> tvCalculate.text = tvCalculate.text.toString() + "8"
                btn9.id -> tvCalculate.text = tvCalculate.text.toString() + "9"
                btnPeriod.id -> tvCalculate.text = tvCalculate.text.toString() + "."
            }

            value = tvCalculate.text.toString()
        } else {
            when(btnSelected.id){
                btn0.id -> tvCalculate.text = tvCalculate.text.toString() + "0"
                btn1.id -> tvCalculate.text = tvCalculate.text.toString() + "1"
                btn2.id -> tvCalculate.text = tvCalculate.text.toString() + "2"
                btn3.id -> tvCalculate.text = tvCalculate.text.toString() + "3"
                btn4.id -> tvCalculate.text = tvCalculate.text.toString() + "4"
                btn5.id -> tvCalculate.text = tvCalculate.text.toString() + "5"
                btn6.id -> tvCalculate.text = tvCalculate.text.toString() + "6"
                btn7.id -> tvCalculate.text = tvCalculate.text.toString() + "7"
                btn8.id -> tvCalculate.text = tvCalculate.text.toString() + "8"
                btn9.id -> tvCalculate.text = tvCalculate.text.toString() + "9"
                btnPeriod.id -> tvCalculate.text = tvCalculate.text.toString() + "."
            }
        }

    }

    fun btnOperatorOnClick(view: View) {
        value1 = tvCalculate.text.toString()
        tvCalculate.text = ""
        val btnSelected = view as Button
        when(btnSelected.id){
            btnDivide.id -> operator = "/"
            btnMultiply.id -> operator = "*"
            btnMinus.id -> operator = "-"
            btnPlus.id -> operator = "+"
            btnAC.id -> Reset()
        }

    }

    fun Reset() {
        tvCalculate.text = "0"
    }

    fun btnCalcOnClick(view: View) {
        if(operator.equals("/")){
            total = value1.toDouble() / tvCalculate.text.toString().toDouble()
        } else if (operator.equals("*")){
            total = value1.toDouble() * tvCalculate.text.toString().toDouble()
        } else if (operator.equals("-")){
            total = value1.toDouble() - tvCalculate.text.toString().toDouble()
        } else if (operator.equals("+")){
            total = value1.toDouble() + tvCalculate.text.toString().toDouble()
        }
        tvCalculate.text = total.toString()
    }



}