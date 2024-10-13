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

    //default parameter value
    //default parameter value merupakan cara untuk memanggil default pada parameter fungsi
    fun WithDefaultParameter(name: String = "Rafi", age: Int){
        println()
        println("== WithDefaultParameter ==")
        println("Hello $name! You are $age years old.")
    }

    fun WithReturn(panjang : Int, lebar : Int) : Int {
        val luas = panjang * lebar
        println("$luas")
        return luas
    }

    fun main(){
        WithoutParameter()
        WithParameter("Uceng")
        WithNamedArgument(name = "Uceng", age = 30)
        WithDefaultParameter(age = 25)
    }
}