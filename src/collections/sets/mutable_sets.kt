package collections.sets

fun main(){

    /**Mutable set is Linked hash set => linkedSetOf()*/

    val s = mutableSetOf(1,4)
    s.add(7)
    s.add(6)
    s.add(5)
    s.remove(1)
    for(i in s){
        println(i)
    }
    /**try methods from lists*/
}