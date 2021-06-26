package com.yagmurerdogan.simpletextcomposeapplication

/*
        This file for Kotlin basics
 */

open class Person constructor(val age: Int) {

    open fun talk() {
        val message: String = "I am simple person aged $age."
        println(message)
    }
}

class Teacher constructor(age: Int): Person(age) {

    override fun talk() {
        val message: String = "I am a teacher aged $age."
        println(message)
    }

    fun teach() {
        println("I teach.")
    }
}

fun main(args: Array<String>) {

    val simplePerson: Person = Person(20)
    simplePerson.talk()

    var teacher = Teacher(age = 30)
    teacher.talk()
    teacher.teach()

    teacher = Teacher(age = 40)
    teacher.talk()

}