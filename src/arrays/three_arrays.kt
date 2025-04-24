package arrays

fun main(){
    val a = Array(4){0}
    for(i in a){
        print("$i ")
    }
    println()

    val b = Array(4){i -> i}
    //i refers to index of arrays like 0 1 2 3
    for(i in b){
        print("$i ")
    }
    println()

    val c = Array(4){i -> i * 2}
    //i refers to index of arrays like 0 1 2 3 * 2
    for(i in c){
        print("$i ")
    }
    println()
}