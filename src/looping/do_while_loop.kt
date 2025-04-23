package looping

import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    var i = 1000
    do {
        if(i > 9){
            println("Enter a number less than 10")
            i = scanner.nextInt()
        }
        println("Kotlin $i")
        i++
    }while(i < 10)
}