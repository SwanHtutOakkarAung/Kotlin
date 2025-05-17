package collections.sets

fun main(){

    /**Immutable set is Linked hash set => linkedSetOf()*/

    val s = setOf(1,2,3,4,1,2)
    /** has to be unique.*/
    println(s)

    /**A list can be converted to a set.*/
    val l = listOf(11,22,33,44,11,22,11)
    println(l.toSet())

    /**Accessing all elements with for in loop.*/
    val q = setOf("Hathor","Snowy","Lisa","Dorami")
    for(i in q){
        println(i)
    }
}