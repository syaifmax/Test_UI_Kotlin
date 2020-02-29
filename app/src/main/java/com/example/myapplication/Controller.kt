package com.example.myapplication

class Controller(var view: MainView) {
    fun process (number1 : Int, number2 : Int) {
        if (number1==number2) {
            view.showResult("=")
        } else if (number1 > number2) {
            view.showResult(">")
        } else if (number1 < number2) {
            view.showResult("<")
        }
    }
}