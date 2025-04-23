package conditions

import java.util.Scanner

fun main(){

    val scanner = Scanner(System.`in`)

    println("Enter a number")
    val number = scanner.nextInt()

    //method 1
    when(number){
        1 -> println("The number is $number")
        2 -> println("The number is $number")
        3 -> println("The number is $number")
        else -> println("Invalid!")
    }

    //method 2
    val strNumber = when(number){
        1 -> "The number is $number"
        2 -> "The number is $number"
        3 -> "The number is $number"
        else -> "None of the above!"
    }
    println(strNumber)
}