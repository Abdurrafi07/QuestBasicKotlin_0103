package com.example.muzaka1project

class Functions {
    fun WithoutParameter(){
        println("== WithoutParameter ==")
        println("Hello World")
    }

    fun WithParameter(name: String){
        println()
        println("== WithParameter ==")
        println("Hello $name!")
    }

    //named argument
    //named argument merupakan cara untuk memanggil fungsi dengan menyebutkan nama parameter
    fun WithNamedArgument(name: String, age: Int){
        println()
        println("== WithNamedArgument ==")
        println("Hello $name! You are $age years old.")
    }

}