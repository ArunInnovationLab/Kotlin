package course.week2

//When one class inherits from another, it takes all the previous class’s behavior (its methods and properties).
// It also becomes its subclass, which means that it can be used wherever its parent is expected

open class Mammal {

    fun feedChildren() {
        println("feeding children")
    }
}

class Doggg: Mammal() {
    fun fetchStick(){
        println("fetching stick")
    }
}

fun feed(mammal: Mammal) {
    mammal.feedChildren()
}

fun main(){
    val dogg = Doggg()
    dogg.feedChildren()
    dogg.fetchStick()
    feed(dogg)
}