package arrays

fun main(){

    val twoDimen : Array<Array<Any>> = arrayOf(arrayOf("Name", "Code"), arrayOf("Isaac", 808))
    for(i in twoDimen){
        for(j in i){
            print("$j ")
        }
        println()
    }

}