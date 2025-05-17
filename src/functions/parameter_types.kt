package functions

fun main(){
    summation(10)
    println()
    val info = infoPerson(name = "Isaac")
    println(info)
    val newInfo = infoPerson(age = 26)
    println(newInfo)
    val someInfo = infoPerson(address = "Bangkok")
    println(someInfo)
    val myInfo = infoPerson(name = "Isaac", age = 26, address = "Bangkok")
    println(myInfo)
}

/**with default arguments*/
fun summation(number1: Int, number2: Int = 0){
    println("The summation is ${number1+number2}.")
}

/**with optional arguments*/
fun infoPerson(name: String? = null, age: Int? = null, address: String? = null) : String{
    var info = ""
    if(null != name){
        info = "Name - $name,"
    }
    if(null != age){
        info = "$info age - $age,"
    }
    if(null != address){
        info = "$info address - $address"
    }
    return info
}