package com.techkurth.app_passwordgenerator

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.techkurth.app_passwordgenerator.databinding.ActivityMainBinding
import kotlin.random.Random
import kotlin.random.nextInt

class MainActivity : AppCompatActivity() {

    private lateinit var biding: ActivityMainBinding
    private val letter = arrayOf(
        "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
        "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        biding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(biding.root)

        biding.btGeneratePsswd.setOnClickListener {

            val letter1 = letter.random()
            val letter2 = letter.random()
            val number_code = Random.nextInt(1000..9999)

            biding.txtPsswd.text = "$letter1$letter2-$number_code"


        }
    }
}