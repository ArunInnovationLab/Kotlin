package course.week2

fun main(){
    //function is a set of instructions to accomplish a specific task

    //Parameter : Variable declared as part of function definition

    //Argument : Value passed when a function is called


    println(double(10))

    println(absolute(10))

}

fun double(value : Int) : Int {
    return value*2;
}


// Absolute function :The absolute function is a function that returns an integer value without a sign, so this does not change positive values, but it turns all negative values into positives.
//The absolute value of a number is the distance between that number and zero
fun  absolute(value:Int) : Int{
    if(value >= 0){
        return value
    }
    else{
        return -value
    }
}