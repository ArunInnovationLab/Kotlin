package course.week2

//default arguments
fun openBrowser(url: String, incognitoMode:Boolean){
    println("Opening $url "+ if (incognitoMode) "in incoginto mode" else " ")
}

//named arguments
fun cheer(how : String = "Hello", who: String = "World"){
    println("$how$who")
}


fun main(){
    //openBrowser("website1.com",false)
    cheer()
    cheer("hi","jhasjas")
    cheer("shgdhsgd")
    cheer(who = "Learner", how = "hi")
    cheer(how = "Hi ")
    val sjkd:Double =-10.1;
    println(sjkd)
}