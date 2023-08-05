package course.week1

fun main(){


    //for loop is used to invoke an action for each element in a list

    val letters = listOf("A","B","C")

    for (letter in letters){
        println("the next letter is $letter")
    }

    // for loop to iterate over numbers
    for (i in 1..5 step 2){
        println(i)
    }

    // until 5
    for (i in 1 until 5){
        println(i)
    }

    //downTo

    for (i in 5 downTo 1 step 2 ){
        println(i)
    }


}