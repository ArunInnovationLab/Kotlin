package course.week2

interface I {
    fun a(){
        println("a")
    }
}

class C: I {


    fun b(){
        println("b")
    }
}

interface A
class Dg : A

fun main(){
    val o:I = C() // You cannot use b on o, because it is typed as I. C was up-casted to I and b cannot be used without explicit down-casting.
    val c:C = o as C // down-casting : c can access both a and b functions

//    val dog : Dg = Dg()
//    val animal:A = dog
  //  val dog2:Dg = animal -> //animal can not be used as dog

}