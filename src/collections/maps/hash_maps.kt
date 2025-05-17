package collections.maps

fun main(){
    val m = HashMap<String,String>()

    m["h"] = "value h"
    m["g"] = "value g"
    m["z"] = "value z"
    m["a"] = "value a"
    m["e"] = "value e"
    m.forEach{
        println("Key is ${it.key} and value is ${it.value}")
    }
}