package course.week2

//Calss inheritance define a class that extend from another
// class and introduces some modifications to the behaviour
// The super class must be open (there must be an open modifier)

open class Drone {

    open val look = "Black and White"

    open fun move(front:Double, up:Double, rotate:Double){
        println("Moving $front $up $rotate")
    }

    open fun setOff(){
        move(0.0,10.0,0.0)
    }
}

class SuperheroDrone() : Drone(){
    override val look : String = "Superhero look";

    override fun setOff() {
        move(0.0,15.0,0.0)
    }

    override fun move(front: Double, up: Double, rotate: Double) {
        println("Superhero is moving")
        super.move(front, up, rotate)
    }
}


fun main(){
    val drone : Drone = SuperheroDrone()
    println(drone.look)


    drone.setOff()
}