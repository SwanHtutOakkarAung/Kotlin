package functions

fun main(){
    println("The multiplication result is ${multiplication(3,4)}")
    greet()
    val decision = evenOrOdd(5)
    println(decision)
    val decision2 = evenOrOdd2(10)
    println(decision2)
}

/**with one Unit statement*/
fun greet() = println("Hello, world!")

/**with one return statement*/
fun multiplication(number1: Int, number2: Int): Int = number1 * number2

fun evenOrOdd(number : Int): String {
    return if(number % 2 == 0){
        "Even"
    }else{
        "Odd"
    }
}

/**if else in ternary operator*/
fun evenOrOdd2(number : Int): String = if(number % 2 == 0) "Even" else "Odd"