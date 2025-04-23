package looping

fun main(){
    for(i in 1..10){
        println("Kotlin $i")
        if(i == 5){
            break
        }
    }

    for(i in 1..3){
        for(j in 1..3){
            println("i = $i and j = $j")
            if(j == 2){
                break
            }
        }
        println()
    }

    outerLoop@ for(i in 1..3){
        for(j in 1..3){
            println("i = $i and j = $j")
            if(j == 2){
                break@outerLoop
            }
        }
        println()
    }
}