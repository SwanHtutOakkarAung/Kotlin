package functions

fun main(){
    square(5)
    sum(3,5)
    sum(number2 = 20, number1 = 43)

    val result = subtract(number1 = 2, number2 = 34)
    println("Subtracted result is $result")
}

fun square(number: Int){
    println("The square of $number is ${number * number}")
}

fun sum(number1: Int, number2: Int){
    println("The sum of $number1 + $number2 = ${number1 + number2}")
}

fun subtract(number1: Int, number2: Int): Int{
    return number1 - number2
}

