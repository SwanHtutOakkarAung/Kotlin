package looping

fun main(){
    for(i in 1..10){
        if(i%2 == 0){
            continue
        }
        println("i = $i")
    }

    for(i in 1..10){
        for(j in 1..10){
            if(j % 2 == 0){
                continue
            }
            println("i = $i and j = $j")
        }
        println()
    }

    outerLoop@ for(i in 1..10){
        for(j in 1..10){
            if(j % 2 == 0){
                continue@outerLoop
            }
            println("i = $i and j = $j")
        }
        println()
    }
}