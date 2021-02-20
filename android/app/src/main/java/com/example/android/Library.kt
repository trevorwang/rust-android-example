package com.example.android

class Library {
    init {
        System.loadLibrary("rust")
    }

    external fun hello(text: String): String
}