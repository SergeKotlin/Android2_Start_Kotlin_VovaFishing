package com.android1.android2_start_kotlin

import android.util.Log

//data class Person(val firstName: String, val secondName: String) {
data class Person(var firstName: String, val secondName: String) {
    //val - неизменяемый тип, var - изменяемый
    val ti: Int
    private val tag = "Person"

    init { //тоже конструктор. Как вторая часть конструктора, после получания переменных на входе
        ti = 20
        doSomething()
    }

    fun doSomething() {
        firstName = "Sasha"
        val a = 0
        val c = 2f
        val b: Double = 10.0

        // Вместо switch (да и вместо if) теперь when
        when(ti) {
            20 -> Log.i(tag, "Ti is 20")
            30 -> Log.i(tag, "Ti is 30")
        }
    }

    //Вместо static:
    companion object {
        const val key = "dataKey"
        //const - скомпилировано на этапе компиляции, а не выполнения программы
    }
}
