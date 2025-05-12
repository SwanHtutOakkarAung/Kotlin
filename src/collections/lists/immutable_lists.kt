package collections.lists

fun main(){
    /**
     Immutable lists
     */
    val a = listOf(23,24,25,1,2,3,7,-1)
    /**READING*/
    //accessing the element in a list
    println(a[0])
    //accessing the element in a list
    for(i in a){
        println(i)
    }
    //accessing the range of the index numbers
    println(a.indices)
    //accessing the element in a list
    for(i in a.indices){
        println("Index $i is ${a[i]}")
    }
    //accessing the element in a list
    a.forEach { println(it) }
    //accessing the element in a list
    println(a.elementAt(1))
    //to escape the index out of bound
    println(a.elementAtOrNull(4))
    //to access the size of a list
    println(a.size)
    //to access the size with a given condition
    println(a.count{it > 10})
    println(a.count{it < 0})

    println()

    /**SEARCHING*/
    println(a.contains(-1))
    println(a.indexOf(25))
    println(a.find { it > 23 })
    println(a.findLast { it > -1})

    println()

    /**FILTERING*/
    println(a.filter { it > 10 })

    println()

    /**MAPPING*/
    println(a.map { it * 2 })
    println(a.map { "The item is $it" })

    println()

    /**SORTING*/
    println(a.sorted())
    println(a.sortedDescending())
    /**SORTING Strings*/
    val s = listOf("apple","banana","pineapple")
    println(s.sortedBy { it.length })
    println(s.sortedByDescending { it.length })

    println()

    /**CHECKING*/
    println(a.isEmpty())
    println(a.isNotEmpty())
    println(a.isNullOrEmpty())
    println(a.any { it < 20 })
    /**CHECKING Strings*/
    println(s.any { it.startsWith("p") })

}