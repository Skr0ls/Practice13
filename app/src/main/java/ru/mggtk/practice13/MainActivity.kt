package ru.mggtk.practice13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val edtv:EditText = findViewById(R.id.editTextNumber)
        edtv.requestFocus()
    }

    fun changeButton(view: View) {
        val edtv:EditText = findViewById(R.id.editTextNumber)
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
    }
}
}