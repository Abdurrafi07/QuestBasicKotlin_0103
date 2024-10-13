package com.example.muzaka1project
import kotlin.collections.MutableList
class Colection {
    fun contohList() {
        println("=== List ===")
        //List Read-Only
        val readOnlyAbjad = listOf("A", "B", "C")
        println(readOnlyAbjad)

        //List Mutable
        val shape: MutableList<String> =
            mutableListOf("Circle", "Square", "Triangle")
        println(shape)

        //Menambah data ke dalam List Mutable
        shape.add("Circle")
        println(shape)

        //Menghapus data dari List Mutable
        shape.remove("Triangle")
        println(shape)

        //Mengubah data di dalam List Mutable
        shape[0] = "Oval"
        println(shape)

        //List Read-Only
        val shapesLocked: List<String> = shape
        println(shapesLocked)
    }
}