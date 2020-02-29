package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView {
    var number1 = 0
    var number2 = 0
    var state1 = true
    var state2 = true
    lateinit var controller: Controller
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        controller = Controller(this)
        angka_1.setOnClickListener {
            if (state1){
            it.background = getDrawable(R.drawable.bg_number_click)
            Log.d("BEBAS", angka_1.text.toString())
                number1 = angka_1.text.toString().toInt()
                state1 = false
            } else {
                Toast.makeText(this, "User has select", Toast.LENGTH_SHORT).show()
            }
        }
        angka_2.setOnClickListener {
            if (state1){
                it.background = getDrawable(R.drawable.bg_number_click)
                Log.d("BEBAS", angka_2.text.toString())
                number1 = angka_2.text.toString().toInt()
                state1 = false
            } else {
                Toast.makeText(this, "User has select", Toast.LENGTH_SHORT).show()
            }
        }
        angka_1x.setOnClickListener {
            if (state2){
                it.background = getDrawable(R.drawable.bg_number_click)
                Log.d("BEBAS", angka_1x.text.toString())
                number2 = angka_1x.text.toString().toInt()
                controller.process(number1,number2)
                state2 = false
            } else {
                Toast.makeText(this, "User has select", Toast.LENGTH_SHORT).show()
            }
        }
        angka_2x.setOnClickListener {
            if (state2){
                it.background = getDrawable(R.drawable.bg_number_click)
                Log.d("BEBAS", angka_2x.text.toString())
                number2 = angka_2x.text.toString().toInt()
                controller.process(number1,number2)
                state2 = false
            } else {
                Toast.makeText(this, "User has select", Toast.LENGTH_SHORT).show()
            }
        }

        reset.setOnClickListener {
            state1 = true
            state2 = true
            text_result.text = "?"
            number1 = 0
            number2 = 0
            angka_1.background = getDrawable(R.drawable.bg_number)
            angka_2.background = getDrawable(R.drawable.bg_number)
            angka_1x.background = getDrawable(R.drawable.bg_number)
            angka_2x.background = getDrawable(R.drawable.bg_number)
        }
    }

    override fun showResult(result: String) {
        text_result.text = result
    }
}
