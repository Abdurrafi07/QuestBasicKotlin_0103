package com.example.muzaka1project

class NullSafety {
    fun nullSafety(){
        // neverNull has String type
        var neverNull: String = "This can't be null"

        // Throws a compiler error
        // neverNull =  null

        // nullable has nullable String type
        var nullable: String? = "You can keep a null here"
        // this OK
        nullable = null

    }
}