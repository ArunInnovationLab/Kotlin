package course.week1

fun main(){

    //if-else as an expression

    /*An if-else statement can be used as an expression. In other words, to return a value that can be stored in a variable.
    The returned value is the value returned by the body block that was chosen*/

    val boolValue: Boolean = false;

    val myVal: Double =
        if(boolValue){
            10.5
        }else{
            0.3
        }
    println(myVal)


    //Inside if-else bodies, you can include more than one statement.
    //The value returned by a body is the last expression it has.

        val haveSomeExtraMoney = true
        val tip: Double =
            if (haveSomeExtraMoney) {
                println("Here you go") // Here you go
                1.0 // this value is ignored, because it is not the last one
                5.0 // this value is ignored, because it is not the last one
                10.0
            } else {
                println("Sorry, I am broke")
                0.0
            }
        println(tip) // 10.0


}