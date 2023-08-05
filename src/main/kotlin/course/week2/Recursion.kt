package course.week2

fun main(){
    //factorial(n) = factorial(n - 1) * n
    //factorial(1) = 1
    println(factorial(5))
}

fun factorial(n:Int):Int{
    if (n<=1){
        return 1
    }
    return factorial(n-1)*n
}