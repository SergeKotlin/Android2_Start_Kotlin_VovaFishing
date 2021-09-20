package com.android1.android2_start_kotlin

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.core.widget.addTextChangedListener

//TODO 1ч21мин !!! !!!
val someKey = "SomeKey" // Объявленная тут - глобальная переменная, при чём для всего кода (на Котлин)
fun doCalc() { // Такая же Глобальность. (При чём и без класса ниже можно)
    // Calculation

    /* Глобальные переменные - лучше без них.
    А выбирать файл-расположение красиво - следуя их логической привязанности */
}

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        savedInstanceState?.deepCopy()
        savedInstanceState ?: println()
        if (savedInstanceState == null) println("null") else println("not null")

        val data = Person("Nikita", "Her name")
        val data2 = data.copy() // data Class: будет два разных объекта, как-будто копирование int
        //val - неизменяемый тип, var - изменяемый
        Toast.makeText(this, "Name: ${data.firstName}, ${data.secondName}",
                // {} - для обособления сложных операций (или без них)
                Toast.LENGTH_SHORT).show()

        Person.key
        SomeRepository.repository // синглтон

        val enum = SomeEnum.ONE
        when(enum) { // Use >> "Add remaining branches"
            SomeEnum.ONE, SomeEnum.TWO -> TODO()
            SomeEnum.THREE -> TODO()

            else -> {} // Аналог дефолтной реализации
        }

        SomeEnum.ONE.value

        val textView = findViewById<TextView>(R.id.textView)
        textView.setOnClickListener{
            //... TODO
        }

        val editText = findViewById<EditText>(R.id.editText )

        // Пример анонимного класса:
//        editText.addTextChangedListener(object : TextWatcher{
//              НАЖИМАЕМ Ctrl+O – для переопределения необх. методов })
        editText.addTextChangedListener(object : TextWatcher{
            override fun afterTextChanged(s: Editable?) {
                TODO("Not yet implemented")
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                TODO("Not yet implemented")
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                TODO("Not yet implemented")
            }
        })

        // Циклы
        val array = arrayOf(1, 2, 3, 4) // эл-ты классы обёртки
        val array2 = Array<Double>(30) {0.0}
        val arrayListSomething = arrayListOf<String>()
        val arrayListSomething2 = ArrayList<String>(10)
        val array3 = IntArray(30) // эл-ты примитивы
        array3.contentToString() // Все значания массива будут возвращены в строку
        val value = arrayListSomething[0] // обращение к эл-ту массива элементарное
        println("Владимир, методичка - крута!")

        for(i in 0..10) {
        }

        for(i in array) {
        }

        for(i in array.indices) { // каждое значание i будет соотв. индексу массива
            array[i]
        }

        for(i in 0 until 10) { // невключительно, до 10
        }

        for(i in 10 downTo 1 step 2) { // невключительно, на уменьшение, с шагом 2
        }

        array.forEach {
        }

        // Функциональное программирование - это удобство. Как переменные и конструкторы рядом.
        // Пример.
        val filteredArray = array.filter {it == 2} // Список, где каждое значание равно 2
    }
}