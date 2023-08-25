package course.week3

enum class WeekDay {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}

enum class Difficulty{
    EASY,
    MEDIUM,
    HIGH
}

enum class PizzaSize(val SizeInCm:Int){
    SMALL(15),
    MEDIUM(20),
    LARGE(25),
    EXTRALARGE(30)
}

fun printSize(pizzaSize: PizzaSize){
    println("$pizzaSize is ${pizzaSize.SizeInCm} cm")
}

fun main(){
    println(PizzaSize.LARGE.SizeInCm)
    printSize(PizzaSize.EXTRALARGE)//EXTRALARGE is 30 cm
}

