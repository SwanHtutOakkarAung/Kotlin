package collections.maps

fun main(){

    /**Immutable map is Linked hash map => linkedMapOf()*/

    val m : Map<String,String> = mapOf("Key1" to "value1", "Key2" to "value2")
    val p : Pair<String,String> = "ThisKey" to "ThisValue"
    val q : Pair<String,String> = Pair("ThatKey","ThisKey")
    val r : Map<String,String> = mapOf("KeyNot" to "value10", "KeyKnot" to "value20",Pair("KeyKnock","Value30"))

    /**Reading*/
    println(r["KeyKnock"])

    r.forEach{
        println("Key is ${it.key} and value is ${it.value}")
    }
}