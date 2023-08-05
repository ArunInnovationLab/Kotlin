package course.week1// It is an alternative to If-else-if statement

//when statement


/*
when {
    condition1 -> {
        body1() //execute if condition1
    }

    condition2 -> {
        body2() // executed if condition2, but not condition1
    }

    condition3 -> {
        body2() //executed if condition3, but not condition1 and condition2
    }

    else -> {
        body() //executed if not condition1,condition2 and condition3
    }

*/

fun main(){
    val password = " ajk"

    when{
        password == "" -> {
            println("password can not be empty")
        }
        password.length < 7 -> {
            println("This password is quite short")
        }

        else -> {
            println("This password is OK")
        }
    }



    // when can also be used as an expression
    val passwd = " ajkiuieruiei"

    val txtToShow = when{
        passwd == "" -> println("password can not be empty")

        passwd.length < 7 -> println("This password is quite short")

        else -> println("This password is OK")

    }

    println(txtToShow)


    // when can also be used as switch statement in Java

    val number = 1
    when(number){
        1->{
            println("One")
        }
        2,3,5,6 -> {
            println("Two")
        }
        else -> {
            println("Big")
        }
    }

    // using when to compare string values
    val userRole = "admin"
    val hasAccess =
        when(userRole){
            "admin" -> true
            "" -> false
            else -> "ahjshjh jashjsa"
        }

    println(hasAccess)


    //use when with a value as an expression.
    val num = 1 // or 2,3,4,5,6

    val text = when(num) {
        1 -> "missed hit"

        2,3,4,5 -> "hit with value $num"

        6 -> "critical hit"

        else -> "Unsupported value"

    }

    println(text)


    // Using ranges in when statement

    /*The when expression can be simplified, thanks to the feature known as a range check.
    In some branches, the condition might be checking if a value is inside a collection or a range.
    In the following example, instead of 2, 3, 4, , 2..5 was used, so instead of providing values to compare to,
    it checks if the value is in a range of values from 2 to 5. The syntax is as follows: start with the in keyword, and then specify either a
    collection or a range that might contain the value or not.*/

    val num2 = 4 // or 2,3,4,5,6
    val text2 = when(num2){
        1 -> "Missed hit"

        in 2..5 -> "Hit with $num2"

        6 -> "cretical value"

        else -> "Unsupported value"
    }

    println("text 2 : $text2")




    // Type check
    var value = "ABC"

    println(value is String) // true
//    println(value is Int) // false
//    println(value is Boolean) // false
    println(value is Any) // true

    val value1 = 123

//    println(value1 is String) // false
    println(value1 is Int) // true
//    println(value1 is Boolean) // false
    println(value1 is Any) // true


    //a popular pattern in Kotlin to decide what action should be performed based on a variable type.
    val something: Any = "ABC"

    when (something) {
        is String -> println("This is string")
        is Int -> println("This is Int")
        is Double -> println("This is double")
        is Boolean -> println("This is boolean")
    }

}


// when can also be used as an expression

// when the value inside a branch is single, we can use that value directly without parenthesis - this looks more concise

