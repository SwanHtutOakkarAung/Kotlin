package looping

fun main(){

    //cannot be used for multiple conditions like Java -> for(int i; i>2 && i%2==0; i++)

    for(i in 1..100){
        print("$i ")
    }

    println()

    for(i in 1..100 step 10){
        print("$i ")
    }

    println()

    //"until" keyword
    for(i in 1 until 10){
        print("$i ")
    }

    println()

    for(i in 1 until 20 step 2){
        print("$i ")
    }

    println()

    //"downTo" keyword
    for(i in 20 downTo 1){
        print("$i ")
    }

    println()

    for(i in 20 downTo 1 step 3){
        print("$i ")
    }

    println()

    //with array
    val numList = arrayOf(1,2,5,6,9)

    //method 1 -> favourable
    for(i in numList){
        println("$i")
    }
    //method 2
    for(i in numList.indices){
        println(numList[i])
    }
    //method 3
    for(i in 0 until numList.size){
        println(numList[i])
    }


}