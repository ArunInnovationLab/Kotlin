package course.week2


// A possibility to specify a type that accepts objects produced using different classes

//The possibility for an object to have many forms, so to be created using different classes

interface Animal{
    // It can only have abstract methods and variables
    val breed: String
    fun pet()
}

class Dogg(val name:String, override val breed:String):Animal {
    override fun pet() {
        println("Bow")
    }
}

class Cat(val name:String, override val breed: String):Animal{
    override fun pet() {
        println("Meow")
    }
}

fun animalFunctions(animal:Animal){
    //print animal breed, name, action


}

fun play(animal: Animal){
    // upcasting - you have a variable of type Animal. you can turn it into Dog
    val dog:Dogg = animal as Dogg //Do that ONLY when you know an object is of the type you are casting to
    dog.pet()
    println("${animal.breed} is playing")
}

fun play2(animal: Animal){
    if (animal is Dogg) { // smart-casting
        animal.pet()
    } else {
        println("I do not know how to play with this animal")
    }

    //
    when(animal){
        is Dogg -> animal.pet()
        is Cat -> println(animal.breed)
    }
}

fun main(){
    val jk = Dogg("jk","Micko")
    val cat = Cat("nb","ashj")
//    play(Cat("nb","ashj"))// err
//    play(jk)


    play2(cat)



//    val dog1 :Animal = jk
//
//    println(dog1.pet())
//val aa:Any
//val jahs:Number
//val jsk:Int
//    val dog:Animal = Dogg("ajjsk","jhjhjas")

   // Dog is a subtype of Animal. You can't also say that Animal is a supertype of Dog.
}

