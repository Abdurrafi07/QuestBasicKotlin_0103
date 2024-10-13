package com.example.muzaka1project
import kotlin.collections.MutableList
class Colection {
    fun ContohList() {
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

    fun ContohSet(){
        println()
        println("=== Set ===")

        // Set Read-Only
        val readOnlyAbjad = setOf("A", "B", "C")
        println(readOnlyAbjad)

        // Set Mutable
        val shape: MutableSet<String> = mutableSetOf("Circle", "Square", "Triangle")
        println(shape)

        // Menambahkan data kedalam Set Mutable
        shape.add("Rectangle")
        println(shape)

        // Menghapus data dari Set Mutable
        shape.remove("Circle")
        println(shape)

        // Set Read-only
        val shapesLocked: Set<String> = shape
        println(shapesLocked)
    }

    fun ContohMap(){
        println()
        println("=== Map ===")

        // Map Read-Only
        val readOnlyShape: Map<String, Int> = mapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
        println(readOnlyShape)

        // Map Mutable
        val shape: MutableMap<String, Int> = mutableMapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
        println(shape)

        // Menambahkan data ke dalam Map Mutable
        shape["Rectangle"] = 4
        println(shape)

        // Menghapus data dari Map Mutable
        shape.remove("Circle")
        println(shape)

        // Mengubah data di dalam Map Mutable
        shape["Square"] = 5
        println(shape)

        // Map Read-Only
        val shapeLocked: Map<String, Int> = shape
        println(shapeLocked)
    }

    fun main() {
        ContohList()
        ContohSet()
        ContohMap()
    }
}