package functions

fun main(){
    val cal = calculateNumber()
    cal(3,4)

    val cal2 = calculateNumber2()
    cal2(4,3)

    val cal3 = calculateNumber3(1)
    cal3(1)
    /**same as following*/
    calculateNumber3(3)(3)
}

fun calculateNumber(): (Int,Int) -> Unit {
    return ::adding
}
fun adding(num1:Int,num2:Int){
    println("$num1 + $num2 is ${num1+num2}")
}

/**simplified version of above method*/
fun calculateNumber2(): (Int,Int) -> Unit{
    return{num1:Int,num2:Int -> println("$num1 + $num2 is ${num1+num2}") }
}

fun calculateNumber3(num1: Int) : (Int)-> Unit{
    return{num2:Int -> println("$num1 + $num2 is ${num1+num2}") }
}