package com.yagmurerdogan.simpletextcomposeapplication

/*
        This file for Kotlin basics
 */

public final class Person constructor(private val age: Int) {

    open fun talk() {
        val message: String = "I am simple person aged $age."
        println(message)
    }
}

fun main(args: Array<String>) {
    val simplePerson: Person = Person(20)
    simplePerson.talk()
}