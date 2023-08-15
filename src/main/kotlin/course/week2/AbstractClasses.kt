package course.week2

//the abstract keyword before a class definition, you make this class abstract
//Abstract classes can have abstract methods or properties. Such elements are marked with an abstract modifier, and they do not have a body
//Abstract classes cannot be used to create objects.you can inherit subclasses from them
//you cannot create objects with abstract methods or properties. Those need to be overridden.
//The key advantage of abstract classes is that they can have non-open methods (on interfaces, all elements are open) and non-abstract properties.

abstract class ShapeDrawer {
    internal abstract fun drawLine()

    fun drawSquare(){
        drawLine()
    }

    fun drawRectangle(){
        drawLine()
    }

}

class AndroidShapeDrawer : ShapeDrawer(){
    override fun drawLine() {
        println("Test code -Draw line for  android platform")
    }
}

class DesktopShapeDrawer : ShapeDrawer() {
    override fun drawLine() {
        println("Test code -Draw line for  desktop platform")
    }
}


fun main(){
    val androidShapeDrawer:AndroidShapeDrawer = AndroidShapeDrawer()
    androidShapeDrawer.drawSquare()

    val desktopShapeDrawer:DesktopShapeDrawer = DesktopShapeDrawer()
    desktopShapeDrawer.drawRectangle()
}

/*INTERFACE
*All methods are open
*Methods and members are abstracted by default
*A class can implement one or more interface
* */

/*ABSTRACT CLASS
* methods can be open or non open
* methods and members can be abstract or non abstract
* a class can only be inherited from one class
* */