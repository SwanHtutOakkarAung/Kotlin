package conditions

import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)

    println("Enter a number")
    val userNumber = scanner.nextInt()
    if(userNumber >0){
        println("It is positive")
    }else if(userNumber <0){
        println("It is negative")
    }else{
        println("It is zero")
    }

    println()

    if(userNumber %2 == 0){
        println("It is even")
    }else{
        println("It is odd")
    }

    println()

    val evenOrOdd = if(userNumber % 2 != 0) "Odd" else "Even"
    println(evenOrOdd)
}