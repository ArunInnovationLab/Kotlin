package course.week1

fun main(){

    for (i in 1..9){

        if(i<5){
            val spaces = 5-i
            for (j in 1..spaces){
                print(" ")
            }

            val stars = i
            for (k in 1..stars){
                print("*")
            }

            println()
        }

        else{
            val spaces = i-5

            for (l in 1..spaces){
                print(" ")
            }

            val stars = 5 - spaces
            for (m in 1..stars){
                print("*")
            }
            println()
        }
    }
}