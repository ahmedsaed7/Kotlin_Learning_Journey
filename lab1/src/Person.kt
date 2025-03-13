open class Person  (val name: String, val age: Int, val  mobilePhone:String) {
    constructor():this("defult name " , 24 , "0112369875"){
        println("Default constructor called.")
        if (age < 18) {
            println("Age must be 18 or older.")
        } else {
            println("Age is valid.")
        }
        if (mobilePhone.length != 11) {
            println("Invalid mobile phone number. Please enter a 11-digit number.")
        } else {
            println("Mobile phone number is valid.")
        }
    }
    init {

    }
    fun  customizePrinting(){
        println("$name and $age years old")
    }
}

class Circle(val radius:Double) {
    constructor(name:String) : this(1.0)
    constructor(diameter:Int) : this(diameter / 2.0) {
        println("in diameter constructor")
    }
    init {
        println("Area: ${Math.PI * radius * radius}")
    }
}



class Person1(var name: String){

}

class initblock (name :String){
    init {
        println("first ${name}")
    }
    init {
        println("second ${name.length}")
    }
}

class Day constructor(val  name: String , index:Int , mge : String){
    val index:Int
    init {
        this.index = index
        println(mge)
    }
    constructor():this("friday" , 7 , "holiday"){
        if (index > 7  || index < 0) {
            println("not find")
        }
        else{
        print("$index and ${name} ")
        }
    }
    constructor(name: String , index: Int):this(name,index,"$name is grater "){}
}

class Person2(val firstName: String, val lastName:String) {
    val fullName:String
        get() {
            return "$firstName $lastName"
        }
}

class Course( id : Int  ,   name: String) {

    val id :Int = 0

        get() {
            return  field.plus(1)
        }
    var name :String ? = null
    set(value) {
        if (value.isNullOrEmpty()){
            field = "Defult"
        }
        else{
            field = value
        }
    }
}