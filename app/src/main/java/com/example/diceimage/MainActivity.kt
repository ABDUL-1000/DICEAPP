package com.example.diceimage
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)

        rollButton.setOnClickListener {
            roll()
        }
    }

    private fun roll() {
        val diceOne = Dice(6)
        val diceTwo = Dice(6)
        val diceThree = Dice(6)
        val diceOneResult = diceOne.roll()
        val imageView: ImageView = findViewById(R.id.imageView)
        val imageView2: ImageView = findViewById(R.id.imageView2)
        val imageView3: ImageView = findViewById(R.id.imageView3)
        val diceTwoResult = diceTwo.roll()
        val diceThreeResult = diceThree.roll()
        val drawableResource01 = when (diceOneResult) {
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            else -> R.drawable.dice6


        }
        val drawableResource02 = when (diceTwoResult) {
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            else -> R.drawable.dice6


        }
        val drawableResource03 = when (diceThreeResult) {
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            else -> R.drawable.dice6


        }
        imageView.setImageResource(drawableResource01)
        imageView2.setImageResource(drawableResource02)
        imageView3.setImageResource(drawableResource03)

        imageView.setImageResource(drawableResource01)
        imageView2.setImageResource(drawableResource02)
        imageView3.setImageResource(drawableResource03)
        val toastOne = Toast.makeText(this, "YOU WIN", Toast.LENGTH_SHORT)
        val toastTwo = Toast.makeText(this, "YOU LOSE", Toast.LENGTH_SHORT)
        if (diceOneResult == 6 && diceTwoResult == 6 || diceOneResult == 6 && diceThreeResult == 6) {

            toastOne.show()

        } else if (diceTwoResult == 6 && diceOneResult == 6 || diceTwoResult == 6 && diceThreeResult == 6) {

            toastOne.show()

        } else if (diceThreeResult == 6 && diceOneResult == 6 || diceThreeResult == 6 && diceTwoResult == 6) {
            toastOne.show()

        }
        if (diceOneResult + diceTwoResult == 9 || diceOneResult + diceThreeResult == 9) {

            toastTwo.show()

        } else if (diceTwoResult + diceOneResult == 9 || diceTwoResult + diceThreeResult == 9) {

            toastTwo.show()

        } else if (diceThreeResult + diceOneResult == 9 || diceThreeResult + diceTwoResult == 9) {
            toastTwo.show()

        }
    }

}

class Dice(private val sides: Int) {
    fun roll(): Int {
        return (1..sides).random()
    }
}


