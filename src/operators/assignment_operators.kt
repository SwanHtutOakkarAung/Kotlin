package operators

fun main(){
    var a = 5
    val b = 4 //constant

    //same as a = a + b
    a += b
    println(a)

    //same as a = a - b
    a -= b
    println(a)

    //same as a = a * b
    a *= b
    println(a)

    //same as a = a / b
    a /= b
    println(a)

    //same as a = a % b
    a %= b
    println(a)

    //same as a = a + 1
    //same as a += 1
    a++
    println(a)
    println(a ++)
    println(++ a)

}