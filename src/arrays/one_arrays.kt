package arrays

fun main(){
    val a : Array<Int> = arrayOf(1,2,3,4)
    val b : Array<String> = arrayOf("Kotlin","Android","Jetpack")
    //reassigning
    a[0] = -2
    //accessing by indexing
    println(a[0])

    //reassigning
    a.set(3,1000)
    //accessing by indexing
    println(a.get(3))

    //accessing through for loop
    for(i in 0..3){
        print("${a[i]} ")
    }
    println()

    //accessing through foreach loop
    for(i in a){
        print("$i ")
    }
    println()

    val dummyArray = arrayOfNulls<Int>(5)
    for(i in dummyArray){
        print("$i ")
    }
    println()

    val emptyArray = emptyArray<Int>()
    ///example usage -> used to return an empty array inside a method
}