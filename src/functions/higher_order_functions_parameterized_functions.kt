package functions

fun main(){
    /**one function as parameters*/
    makeSquare(4, {sq -> println(sq) })
    /**If there is only one parameter inside the parameterized function,
    the following styles are allowed.*/
    makeSquare(5, { println(it) })
    makeSquare(7){ println(it)}

    /**two functions as parameters*/
    makeDouble(5, { println("Doubled value is $it")}, { println("Original value is $it") })

    /**combined functions as parameters*/
    makeDouble2(10){
        original, double -> println("The double value of $original is $double.")
    }

    /**passing function to combined parameterized function*/
    getSquare2(3, ::output2)

    /**parameterized function without arguments*/
    onClickListener({ println("Hello") })
    /**same as following*/
    onClickListener {
        println("Hello")
    }

    onClickListener2 {
        println(it)
    }

    onClickListener3{
        value,value2 -> println("Value 1 is $value Value 2 is $value2")
    }

    onClickListener4(:: onClick)
}

/**one parameterized function*/
fun makeSquare(num: Int, result : (Int) -> Unit ): Unit{
    result(num * num)
}

/**two parameterized functions*/
fun makeDouble(num: Int, result: (Int) -> Unit, original: (Int) -> Unit){
    result(num*2)
    original(num)
}

/**combined parameterized functions*/
/**simplified version of two functions as parameters*/
fun makeDouble2(num: Int, result: (Int,Int) -> Unit){
    result(num, num*2)
}

/**passing function to combined parameterized function*/
fun getSquare2(num: Int, result: (Int,Int) -> Unit){
    result(num, num*num)
}
fun  output2(original: Int, square: Int){
    println("The square of $original = $square")
}

/**parameterized function without arguments*/
fun onClickListener(onClick : () -> Unit){
    onClick()
}

/**another version of above function*/
fun onClickListener2(onClick:(value:String)-> Unit){
    onClick("Click result")
}
fun onClickListener3(onClick:(value: String, value2: String) -> Unit){
    onClick("click result", "click result 2")
}
fun onClickListener4(onClick:()-> Unit){
    onClick()
}
fun onClick(){
    println("Click")
}
