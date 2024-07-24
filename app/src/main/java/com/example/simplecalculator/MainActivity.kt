package com.example.simplecalculator

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var btnAdd : Button
    lateinit var btnAdd2 : Button
    lateinit var btnAdd3 : Button
    lateinit var btnAdd4 : Button

    lateinit var editText1: EditText
    lateinit var editText2: EditText

    lateinit var resultend: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        btnAdd = findViewById(R.id.add_btn)
        btnAdd2 = findViewById(R.id.add_btn2)
        btnAdd3 = findViewById(R.id.add_btn3)
        btnAdd4 = findViewById(R.id.add_btn4)

        editText1 = findViewById(R.id.get_a)
        editText2 = findViewById(R.id.get_b)

        resultend = findViewById(R.id.resultEnd)

        btnAdd.setOnClickListener(this)
        btnAdd2.setOnClickListener(this)
        btnAdd3.setOnClickListener(this)
        btnAdd4.setOnClickListener(this)
    }

    @SuppressLint("SetTextI18n")
    override fun onClick(v: View?) {

        val a = editText1.text.toString().toDouble()
        val b = editText2.text.toString().toDouble()
        var result = 0.0

        when(v?.id){
            R.id.add_btn ->{
                result = a + b
            }
            R.id.add_btn2 ->{
                result = a - b
            }
            R.id.add_btn3 ->{
                result = a * b
            }
            R.id.add_btn4 ->{
                result = a / b
            }
        }
        resultend.text = "${result.toInt()}"
    }
}