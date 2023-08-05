package course.week2

fun printStars(num : Int){
        for (j in 1..num){
            print("*")
        }
        println()
}

fun ascendingTriangle(height: Int) {
    for (i in 1..height) {
        printStars(i)
    }
}

fun descendingTriangle(height: Int){
    for (i in height downTo 1){
        printStars(i)
    }
}

fun isoscelesTriangle(width:Int){
    ascendingTriangle(width-1)
    descendingTriangle(width)
}

fun main (){

    val height = 5
    ascendingTriangle(height)
    descendingTriangle(height)
    isoscelesTriangle(5)

}


// functions with return value
fun triangleArea(width: Double,height: Double) : Double{
    return width*height/2
}

fun biggerOf(a: Int, b: Int): Int {
    return if (a > b) a else b
}

//In Kotlin, there is a special syntax for single expression functions. Instead of braces with the body, you use the equality sign, which specifies what should be returned.

fun triangleArea2(width: Double, height: Double): Double = width * height / 2

fun biggerOf2(a: Int, b: Int): Int = if (a > b) a else b


fun sjdhjsF(a: Int,b:Int): String{
    return (a+b).toString()
}
