package com.android1.android2_start_kotlin

import android.util.Log

open class BaseSomeClass : BaseHandling { // open для наследования

    //    override val a = 70 Лаконичный аналогичный вариант инициализации ниже, геттер внутри уже есть
    override val a: Int
        get() = TODO("Not yet implemented")

    private lateinit var helloStr: String // Для поздней иниц-ции, после конструктора.
                                          // (Но придется обращаться через ?, т.е проверку null)
    private var someStr: String ?= null // С дефолтным значением, типа как обычно

    fun focus() {
        val cd: String ?= "cd"
        cd!! // Можно накричать на компилятор, и в дальнейшем по переменной не будет проверки ? на null
        // Нужно быть очень уверенным в этом фокусе. Иначе код упадёт.
        cd.length
    }


    override fun initData() {
        //TODO("Not yet implemented")
        b = 40
        helloStr = "Hi"

//        val length = someStr?.length
        val length = someStr?.length ?: 0 // условие на условие =)

        var variable = if(length == 10) 20 else 30
    }

    // Геттеры и сеттеры больше нет необходимости писать вручную, в Kotlin
    // Любая переменная по сути ссылка на геттер либо сеттер
    // Простая запись:
    var b = 30
    // означает, что при обращении мы (между строк) вызываем геттер для b, а при записи сеттер
        get() { // можно задать и по-прежнему вручную
            return field + 10 // field это ссылка на переменную (b)
        }
        private set

    var c = 50
        set(value) {
            //do something
            field = value
        }

    // public - по умолчанию
    private fun getStringToW(): String { // Возвращаемый тип так теперь
        return if(b == 10) { // можно громоздить прямо в return =)
            "its 10"
        } else if(b == 40) {
            "no, its 40"
        } else {
            "don't know'"
        }
    }

    private fun getStringToE() = "sdsd"
}