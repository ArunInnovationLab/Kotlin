package course.week1

fun main(){


    //these are the four basic types representing numbers

    /*
    * Int is the default integer number representation when a whole number (such as 20) is specified.

    * Long is an integer representation supporting larger numbers. You create it by using an  L suffix.

    * Double is the default decimal number representation. It holds values up to 15 or 16 decimal places.

    * Float is an integer representation supporting smaller decimal numbers. It holds values up to 7 or 8 decimal places. You create it using the F or f suffix.*/

    val a = 10 //the type of a is Int

    val b = 213337364673L // the type of b is Long

    val c = 10.0 // the type of c is double

    val d = 10F //the type of d is Float


    val smallDebt = -0.72;

//    println(smallDebt)

    //use underscores ('_') inside longer numbers to improve their readability

    val million = 1_000_000

//    println(million)

    val i: Int = 1600

    val l:Any

    l = i

 //   println(l)

    val l2: Long = i.toLong()

    val d1: Double = l2.toDouble()

    val d2 : Double = i.toDouble()

//    println(d1)
//    println(d2)

//    println(10 % 3) // 1
//    println(11 % 3) // 2
//    println(12 % 3) // 0
//    println(13 % 3) // 1
//
//    // The sign of the result is always the same as the sign of the left side
//    println(-1 % 3) // -1
//    println(1 % -3) // 1
//    println(-1 % -3) // -1


//take care whenever you divide two integers because the result of this operation will be an integer
    val x = 5
    val z = 2
    println(x / z) // 2
    println(x.toDouble() / z) // 2.5

//a++ is called a postfix operation, which means that if you use that operation in an arithmetic equation, the postfix operation is executed after the equation is evaluated.

}