package course.week3

//In some cases, you need to represent a pair of values. For that, a class you can use is the Pair class

fun main(){
    val pair = Pair(1.0, "one")
    println(pair.first)
    println(pair.second)

    val (number,letter) = pair
    println(number)
    println(letter)

    //There is also another way to create a pair: by placing the to function between two values
    val pair1 = 2.0 to "Two"
    println(pair1)

    //Another such class is called Triple, and it is used to keep three values on properties first, second and third.
    val pair3 = Triple(1F,2L,'c')

}