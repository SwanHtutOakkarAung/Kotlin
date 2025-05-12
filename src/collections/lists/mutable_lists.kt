package collections.lists

fun main(){
    /**
    Mutable lists
     */
    val b = mutableListOf(44,45,46,23,21,-9,-12)
    /**READING*/
    //accessing the element in a list
    println(b[0])
    //accessing the element in a list
    for(i in b){
        println(i)
    }
    //accessing the range of the index numbers
    println(b.indices)
    //accessing the element in a list
    for(i in b.indices){
        println("Index $i is ${b[i]}")
    }
    //accessing the element in a list
    b.forEach { println(it) }
    //accessing the element in a list
    println(b.elementAt(1))
    //to escape the index out of bound
    println(b.elementAtOrNull(4))
    //to access the size of a list
    println(b.size)
    //to access the size with a given condition
    println(b.count{it > 40})
    println(b.count{it < 0})

    println()

    /**ADDING*/
    b.add(100)
    println(b)

    println()

    /**DELETING*/
    b.remove(100)
    println(b)
    b.removeAt(0)
    println(b)
    //b.clear()
    //println(b)

    println()

    /**REPLACING*/
    b[5] = -99
    println(b)

    /**SEARCHING*/
    println(b.contains(-9))
    println(b.indexOf(21))
    println(b.find { it > 45 })
    println(b.findLast { it > -12})

    println()

    /**FILTERING*/
    println(b.filter { it > 40 })

    /**MAPPING*/
    println(b.map { it * 2 })
    println(b.map { "The item is $it" })

    println()

    /**SORTING*/
    println(b.sorted())
    println(b.sortedDescending())
    /**SORTING Strings*/
    val s = listOf("apple","banana","pineapple")
    println(s.sortedBy { it.length })
    println(s.sortedByDescending { it.length })

    println()

    /**CHECKING*/
    println(b.isEmpty())
    println(b.isNotEmpty())
    println(b.isNullOrEmpty())
    println(b.any { it < 20 })
    /**CHECKING Strings*/
    println(s.any { it.startsWith("p") })
}