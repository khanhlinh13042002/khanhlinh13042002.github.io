package com.example.diceroller

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
//import android.widget.Toast



class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)



        rollButton.setOnClickListener { rollDice() }
    }

   // private fun rollDice() = makeText(this, "button clicked",
    //    LENGTH_SHORT
    //).show()

  @SuppressLint("SetTextI18n")
  private fun rollDice(){
       //Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
     // val resultText: TextView = findViewById(R.id.result_text)
      //resultText.text = "DICE ROLLED"
      val diceImage: ImageView = findViewById(R.id.dice_image)
      val randomInt = (1..6).random()
      val drawableResource = when (randomInt) {
          1 -> R.drawable.dice_1
          2 -> R.drawable.dice_2
          3 -> R.drawable.dice_3
          4 -> R.drawable.dice_4
          5 -> R.drawable.dice_5
          else -> R.drawable.dice_6
      }
      diceImage.setImageResource(drawableResource)
}

        }

