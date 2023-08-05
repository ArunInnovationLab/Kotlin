package course.week2

//The properties defined in the body of class must be initliazed

class Student(
    val id:Int,
    val name:String,
    val surname:String
){
    //The properties defined in the body of class must be initliazed
    var college:String = "GSKSJTI"
}


class Subject(
    val name: String,
    val teacher: Teacher,
    val isObligatory: Boolean,
)

class Teacher(
    val name: String,
    val surname: String,
    val birthday: String,
    val status: String,
)

fun main(){

    //using named argument convention
    val arunKumar = Student(id=1,name="Arun Kumar",surname="Yrgol")
    println(arunKumar.id)
    arunKumar.college="PDA"
    println(arunKumar.college)

    val remigiuszFrost = Teacher(name = "Remigiusz", surname = "Frost", birthday = "20.07.1987", status = "ACTIVE")

    val biology1 = Subject(name = "Biology 1", teacher = remigiuszFrost, isObligatory = true)

    println(biology1.teacher.surname)
}