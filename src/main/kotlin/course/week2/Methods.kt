package course.week2

//methods are functions specific to a certain class; defined inside the class body

//class Batista(
//    val name:String
//){
//
//    fun makeCoffee(){
//        println("$name makes coffee")
//    }
//}
//
//fun main(){
//    val barista = Batista(name = "Barista Yono")
//    barista.makeCoffee()
//}



//class Dog(
//    val name:String,
//){
//    var hunger = 62
//
//    fun feed(){
//        println("Feeding $name")
//        hunger = 0
//    }
//}
//
//fun main(){
//
//    val dog = Dog("Rex")
//
//    println(dog.hunger)
//
//    dog.feed()
//
//    println(dog.hunger)
//
//}

// is similar to

//class Dog(val name:String){
//    var hunger = 62
//
//    fun feed(dog: Dog){
//        println("Feeding ${dog.name}")
//        dog.hunger=0
//    }
//}
//
//fun main(){
//    val dog = Dog("jack")
//    dog.feed(dog = dog)
//}

// is similar to


//    When you call a method, the object of their class is passed to their body. It is called a receiver
//    It can be accessed using this keyword, also known as receiver reference
//    if you want to reference an object used to call a method inside this method, use the this keyword.

//class Dog(val name: String){
//    var hunger = 62
//
//    fun feed(){
//        val currentDog = this
//        println("Feeding ${currentDog.name}")
//        currentDog.hunger=0
//    }
//}
//
//fun main(){
//    val dog = Dog("bool")
//    println(dog.hunger)
//    dog.feed()
//    println(dog.hunger)
//}

// is similar to

class Dog(val name:String){
    var hunger = 62
    fun feed(){
        println("Feeding ${this.name}")
        this.hunger=0
    }
}
fun main(){
    val dog = Dog("Rex")
    dog.feed()
}

