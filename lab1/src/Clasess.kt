//fun main (){
//    val c1 :car = car(3,5)
//    println(c1.x)
//
//    println(c1.y)
//}
//class car ( p1:Int , p2:Int ) {
//    constructor() : this(10,1)  //c1
////    constructor(p3:Int) : this(4,p3) // c2
//    var x :Int = p1
//        set(value){
//            field= value
//        }
//    get() = field.plus(1)
//    val y = p2
//}


fun main() {
    /*
    val monday = Day("Monday", 1, "Start of the week")
    println(monday)
    val defaultDay = Day()
    println(defaultDay)
    val wednesday = Day("Wednesday", 3)
    println(wednesday)
    */


//    val circle = Circle(0.0)
//    println("Radius: ${circle.radiusProperty}")
//    circle.radiusProperty = 5.0
//    println("Radius: ${circle.radiusProperty}")
//    println("Area: ${circle.area}")
//    println("Circumference: ${circle.circumference}")
//    circle.radiusProperty = -3.0 // This will not update the radius
//    println("Radius after trying to set negative value: ${circle.radiusProperty}")

    val p = Preant(20,"ahmed",true)
    println(p.sayhello())
    println(p.pro1)
    println(p.pro2)
    println(p.pro3)
    println(p)
}


public  class Preant constructor (val pro1:Int ,var  pro2:String , varable:Boolean){
    val pro3 :Int = 0
    fun sayhello(){
        println("Hello parent ")
    }
    init {
        println("call to primary constractor ")
    }
    constructor(x:Int):this(x , "pro2 value" , false)
}

//class  Day constructor(val name :String , index:Int , msg:String){
//    val index : Int
//    init {
//        this.index = index
//        println(msg)
//    }
//    constructor(): this("Friday",6,"holiday"){}
//    constructor(name: String , index: Int):this(name,index,"$name day is great !")
//    override fun toString(): String { return "Day(name='$name', index=$index)" }
//}
//
//class Circle(var R : Double) {
//    var radiusProperty: Double = R
//        get() {
//            println("Getting the radius")
//            return field
//        }
//        set(value) {
//            if (value >= 0) {
//                println("Setting the radius")
//                field = value
//            } else {
//                println("Radius cannot be negative")
//            }
//        }
//
//    // A computed property for the area of the circle
//    val area: Double
//        get() = Math.PI * radiusProperty * radiusProperty
//
//    // A computed property for the circumference of the circle
//    val circumference: Double
//        get() = 2 * Math.PI * radiusProperty
//}


