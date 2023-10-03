package ru.mggtk.practice13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.math.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val edtv:EditText = findViewById(R.id.editTextNumber)
        edtv.requestFocus()
    }

    fun changeButton(view: View) {
        /*val edtv:EditText = findViewById(R.id.editTextNumber)
        val edtv2:EditText = findViewById(R.id.editTextNumber2)
        val tv: TextView = findViewById(R.id.textView3)
        if (edtv!!.text.toString() == "") {
            Toast.makeText(this,"Введите курс обмена!", Toast.LENGTH_SHORT).show()
            edtv.requestFocus()
        }
        else if (edtv2!!.text.toString() == ""){
            Toast.makeText(this, "Введите сумму для обмена!", Toast.LENGTH_SHORT).show()
            edtv.requestFocus()
        }
        else {
            var num1: Int = edtv.text.toString().toInt()
            var num2: Int = edtv2.text.toString().toInt()
            tv.setText((num1 * num2).toString())
    }*/
        val editTextViewFirstLeg: EditText = findViewById(R.id.editTextNumber)
        val editTextViewSecondLeg: EditText = findViewById(R.id.editTextNumber2)
        val textViewArea: TextView = findViewById(R.id.textView3)
        val textViewPerimetr: TextView = findViewById(R.id.textView4)
        val textViewHypotenuse: TextView = findViewById(R.id.textView5)

        if (editTextViewFirstLeg!!.text.toString() == "") {
            Toast.makeText(this,"Введите курс обмена!", Toast.LENGTH_SHORT).show()
            editTextViewFirstLeg.requestFocus()
        }

        else if (editTextViewSecondLeg!!.text.toString() == "") {
            Toast.makeText(this, "Введите сумму для обмена!", Toast.LENGTH_SHORT).show()
            editTextViewSecondLeg.requestFocus()
        }

        else{
            val firstLeg: Double = editTextViewFirstLeg.text.toString().toDouble()
            val secondLeg: Double = editTextViewSecondLeg.text.toString().toDouble()
            //Площадь через 2 катета
            textViewArea.setText((0.5 * firstLeg * secondLeg).toString())
            //Периметр через 2 катета
            textViewPerimetr.setText((firstLeg + secondLeg + sqrt(Math.pow(firstLeg, 2.0) + Math.pow(secondLeg, 2.0))).toString())
            //Гипотенуза через 2 катета
            textViewHypotenuse.setText((sqrt(Math.pow(firstLeg, 2.0) + Math.pow(secondLeg, 2.0))).toString())
        }

    }
}