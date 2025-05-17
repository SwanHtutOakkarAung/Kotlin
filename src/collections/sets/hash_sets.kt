package collections.sets

fun main(){
    val s = hashSetOf(1)
    s.add(5)
    s.add(3)
    s.add(7)
    //s.add(20)
    s.add(2)
    for(n in s){
        println(n)
    }
}