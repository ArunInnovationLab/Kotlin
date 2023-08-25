package course.week3

enum class PaymentMethod{
    CASH,
    CARD,
    CHECK
}

fun pay(amount:Double, method: PaymentMethod) {
    return when(method){
        PaymentMethod.CARD -> println("pay with card")
        PaymentMethod.CASH -> println("pay with cash")
        PaymentMethod.CHECK -> println("pay with check")
    }
}

// enum class can be easily transformed into a string
fun main(){
    val string1 = "CHECK"
    val method:PaymentMethod = PaymentMethod.valueOf(string1)
    val string2 : String = method.name
    println(string2)

    println(PaymentMethod.CHECK.ordinal)

    println(PaymentMethod.CASH)
}