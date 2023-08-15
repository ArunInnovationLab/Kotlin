package course.week2

// private modifier is restricted to file(for file variables and methods)
// only used inside classes that are open or abstract - visible to class and its subclasses
// internal - visible within a module(within a project) - same as public

open class Ship {
    var milesPassed = 0.0

    fun printMilesPassed(){
        println(milesPassed)
    }
}

open class ElectricShip : Ship(){
    fun swimUsingEngine(distance : Double){
        milesPassed += distance
    }
}

private var a:Int = 10

private fun add(a:Int,b:Int){
    println(a+b)
}

internal fun subtract(a:Int,b:Int){
    println(a+b)
}


fun main(){
    val ship:Ship = Ship()
    println(add(a,1))
}