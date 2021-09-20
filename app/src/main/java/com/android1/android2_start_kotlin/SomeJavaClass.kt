package com.android1.android2_start_kotlin;

class SomeJavaClass (val firstName: String, val lastName: String, val age: Int) : BaseSomeClass() {
    //Ctrl+Alt+Shift+K – автопреобразование Java в Kotlin

    // Многие типы стали с заглавной буквы. Это значит, получили классы-обёртки (могут иметь null)
    // Но по умолчанию они также примитивны. Однако val age: Int? - и тип станет сразу класс-обёртка

    fun corrida() {
        start(10, 20.0, d = 30f )
    }

    fun start(a: Int, b: Double, c: String = "Nothing", d: Float ?= null) {
        initData()

        // if (firstName == lastName) // сравнение значений, вместо .equals
        if (firstName === lastName) print(0) // сравнение ссылок

    }
}

//Для перевода Java проекта на Kotlin:
// >>Tools > Kotlin > Configure Kotlin in Project