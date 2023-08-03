package com.ivanojok.mycalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /** image view */
        val image = findViewById<ImageView>(R.id.my_image)
        /** edit texts */
        val firstNumberEditText = findViewById<EditText>(R.id.first_number)
        val secondNumberEditText:EditText = findViewById(R.id.second_number)

        /** buttons */
        val sumButton = findViewById<Button>(R.id.sum_button)
        val subtractButton = findViewById<Button>(R.id.subtract_button)
        val divideButton = findViewById<Button>(R.id.division_button)
        val multiplyButton = findViewById<Button>(R.id.multiply_button)

        /** text view */
        val answerText:TextView = findViewById(R.id.answer)



        sumButton.setOnClickListener {
            val firstNumber = firstNumberEditText.text.toString().toInt()
            val secondNumber = secondNumberEditText.text.toString().toDouble()

            val sum = firstNumber + secondNumber
            //answerText.setText("The sum is $sum")
            answerText.text = "The sum is $sum"
        }

        subtractButton.setOnClickListener {
            val firstNumber = firstNumberEditText.text.toString().toInt()
            val secondNumber = secondNumberEditText.text.toString().toDouble()

            val sum = firstNumber - secondNumber
            //answerText.setText("The sum is $sum")
            answerText.text = "The difference is $sum"
        }


        answerText.setOnClickListener {
            val imageArray = arrayOf(R.drawable.chicken_leg, R.drawable.hook, R.drawable.biryani)
            image.setImageResource(imageArray.random())
        }

    }
}