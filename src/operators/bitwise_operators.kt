package operators

fun main(){

    //2^3  2^2  2^1  2^0
    //8     4    2    1
    //0     1    0    1
    //in order to get 5
    //0     1    1    0
    //in order to get 6
    val a = 5
    val b = 6
    //to see the binary code of the integer -> 101
    println(a.toString(2))
    //to see the binary code of the integer -> 110
    println(b.toString(2))

    //and operator
    //     4 2 1
    //5 -> 1 0 1
    //6 -> 1 1 0
    //     1 0 0
    println(a and b)

    //or operator
    //     4 2 1
    //5 -> 1 0 1
    //6 -> 1 1 0
    //     1 1 1
    println(a or b)

    //xor operator -> 1 for inequalities and 0 for equalities
    //     4 2 1
    //5 -> 1 0 1
    //6 -> 1 1 0
    //     0 1 1
    println(a xor b)

    //left shift
    //     4 2 1
    //5 -> 1 0 1
    println(a.shl(2))
    //     16 8 4 2 1
    //      1 0 1 0 0

    //right shift
    //     4 2 1
    //5 -> 1 0 1
    println(a.shr(2))
    //     4 2 1
    //     0 0 1 0 1
}