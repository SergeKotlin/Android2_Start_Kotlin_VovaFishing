package com.android1.android2_start_kotlin

object SomeRepository { // Синглтон (создаёт ё раз объект, потом возвращает значение)

    val repository: Double = 0.0

    fun getOurRepository() = repository
}