package collections.maps

fun main(){

    /**Mutable map is Linked hash map => linkedMapOf()*/

    val r = mutableMapOf("Key1" to "value1", "Key2" to "value2",Pair("Key3","Value3"))
    r["Key0"] = "Value0"
    r["Key1"] = "New value1"
    r.remove("Key2")
    r["Key4"] = "Value3"
    //r.clear()
    r.forEach(){
        println("Key is ${it.key} and value is ${it.value}")
    }

    /**Accessing only keys*/
    println("Keys are ${r.keys.toList()}")

    /**Accessing only values.
     * Values can be duplicated*/
    println("Values are ${r.values.toList()}")

    /**Accessing only values.
     * Without getting duplicated values.*/
    println("Values are ${r.values.toSet()}")

    r.entries.forEach {
        println(it.key)
        //println(it.value)
    }
}