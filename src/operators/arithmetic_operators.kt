package operators

fun main(){
    val a = 5;//constant
    val b = 4;//constant

    //addition
    val c = a.plus(b)
    //can be written as like so-> a + b
    println("The addition is $c")

    //subtraction
    val d = a.minus(b)
    //can be written as like so-> a - b
    println("The subtraction is $d")

    //multiplication
    val e = a.times(b)
    //can be written as like so-> a * b
    println("The multiplication is $e")

    //division
    val f = a.toDouble().div(b)
    val g = a.toFloat().div(b)
    //can be written as like so-> a / b
    //.toDouble() or .toFloat() -> to get decimal results
    //.toDouble() or .toFloat() -> follows after dividend
    println("The division with double is $f")
    println("The division with float is $g")

    //remainder
    val h = a.rem(b)
    //can be written as like so-> a % b
    println(h)
}