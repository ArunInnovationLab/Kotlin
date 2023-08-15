package course.week3

/*use data modifier before a class. You use it before classes representing a bundle of data.
Such a class is equal to a different instance of the same class if its constructor properties have the same value.
* */

data class Dog(
    val name:String,
    val age:Int
)
fun main(){
    println('a'=='a')//true
    println("A"=="B")//false

    val dog1 = Dog("Cookie",1)
    val dog2 = Dog("Pluto",7)
    val dog3 = Dog("Cookie",1)

    println(dog1 == dog3)

    println(dog1)
    println(dog2)
    println(dog3)

    //Data classes can be de-structured, which means reading values from this class and assigning them to variables.
    val (name,age) = dog2
    println("$name $age")

    //data classes have a copy method, that creates a copy of an object.
    // It also allows you to specify what modifications you would like to introduce into an object.
    val dog4 = dog2.copy()
    println("Dog4 : $dog4" )
    println(dog4 == dog2)


    val dog5 = dog4.copy(age=12)
    println("Dog5 : $dog5")
}