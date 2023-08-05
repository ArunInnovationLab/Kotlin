package course.week1

fun main(){
    for (i in 1..5){
        for (j in 1..i){
            print("*")
        }
    println(" ")
    }


    println("-------------------------------")


    for (i in 1..5){
        for (j in 1..5){
            print("*")
        }
        println()
    }

    println("-------------------------------")

    for (i in 5 downTo 1){
        for (j in 1..i){
            print("*")
        }
        println()
    }


    println("-------------------------------")

//    *
//    ***
//    *****
//    ***
//    *
    val width = 5
    for (i in 1 until width step 2){
        for (j in 1..i){
            print("*")
        }
        println()
    }
    for (i in width downTo 1 step 2){
        for (j in 1..i){
            print("*")
        }
        println()
    }


    println("-------------------------------")
    for (i in 1..5){
        val numOfSpaces = 5-i
        for (j in 1..numOfSpaces){
            print(" ")
        }

        val numOfStars = i

        for (j in 1..numOfStars){
            print("*")
        }
        println()
    }

    println("-------------------------------")


    for (i in 1..5) {
        val numberOfSpaces = 5 - i
        for (j in 1..numberOfSpaces) {
            print(" ")
        }
        val numberOfStars = i * 2 - 1
        for (j in 1..numberOfStars) {
            print("*")
        }
        println()
    }

    println("-------------------------------")

//    *****
//     ****
//      ***
//       **
//        *

    for (i in 1..5){
        val numberOfSpaces = i - 1
        for (j in 1..numberOfSpaces){
            print(" ")
        }

        val numberOfStars = 6 - i
        for (j in 1..numberOfStars){
            print("*")
        }
        println()

    }

    println("-------------------------------")

    var numOfStars = 9
    for (i in 1..5){
        val numOfSpaces = i - 1
        for (i in 1..numOfSpaces){
            print(" ")
        }

        //var numOfStars = 9
        for (j in 1..numOfStars){
            print("*")
        }

        numOfStars -= 2

        println()

    }

    println("-------------------------------")



}