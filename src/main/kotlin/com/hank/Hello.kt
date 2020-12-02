package com.hank

fun main() {
//    println("Hello Kotlin");

    Human().hello();
    
    val h = Human();
    h.hello();

}

class Human {
    fun hello() {
        println("Hello kotlin");
    }

}
