package looping

import java.util.Scanner

fun main(){

    var i = 0
    while(i < 10){
        println("Kotlin $i")
        i++
    }

    val scanner = Scanner(System.`in`)
    var password = ""
    while(!password.equals("1234567")){
        println("Please enter the correct password")
        password = scanner.nextLine()
    }
    println("You can access now!")
}