package arrays

fun main(){
    //arrays comparison
    val array1 = arrayOf(1,2,3,5)
    val array2 = arrayOf(5,3,2,1)
    println(array1.contentEquals(array2))

    val oneArray = arrayOf(arrayOf(1,2,3), arrayOf(4,5,6))
    val twoArray = arrayOf(arrayOf(1,2,3), arrayOf(4,5,6))
    println(oneArray.contentDeepEquals(twoArray))

    //arrays combination
    val ary1 = arrayOf(2,3,5)
    val ary2 = arrayOf(4,1,9)
    val ary3 = ary1.plus(ary2)
    for(i in ary3){
        print("$i ")
    }
    println()

    //shuffling
    val ary = arrayOf("Java", "Dart", "Kotlin")
    ary.shuffle()
    for(i in ary){
        print("$i ")
    }
    println()

    //sorting
    ary.sort()
    for(i in ary){
        print("$i ")
    }
    println()
}