package course.week2

open class Doggggg(val breed:String)


class Labrador(val name:String) : Doggggg("Labrador retriever")// Here we call animals' constructor
//class Labrador(val name:String) : Doggggg(name)
fun main(){
    val lab = Labrador("coco")

    println(lab.name)//coco

    println(lab.breed)//Labrador retriever
}