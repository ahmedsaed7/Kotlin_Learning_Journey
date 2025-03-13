import kotlin.reflect.typeOf

/**
 * ## Variables in Kotlin
 *
 * In computer programming, a variable is a container for a single piece of data.
 * You can think of it as a box that holds a value, and the box has a label (the variable name).
 * By referring to the variable name, you can access the value it contains.
 *
 * ### Types of Variables
 * 1. **Mutable Variables**: These can be changed after they are initialized.
 *    - Declaration: `var variableName = value`
 *
 * 2. **Immutable Variables**: These cannot be changed once assigned.
 *    - Declaration: `val variableName = value`
 *
 * Although immutability is not strictly enforced, using immutable variables is recommended to avoid unintended changes.
 *
 * **Important**: Once a type has been assigned (either by you or the compiler), you cannot change the type, or you'll encounter an error.
 *
 * ## Data Types in Kotlin
 *
 * ### Integer Types
 * | Type   | Bits |
 * |--------|------|
 * | Long   | 64   |
 * | Int    | 32   |
 * | Short  | 16   |
 * | Byte   | 8    |
 *
 * ### Floating-Point and Other Numeric Types
 * | Type    | Bits |
 * |---------|------|
 * | Double  | 64   |
 * | Float   | 32   |
 * | Char    | 16   |
 * | Boolean | 8    |
 *
 * **Operand Types**: The results of operations retain the types of the operands.
 *
 * ** Type Casting **
 * **Type Casting**
 * In Kotlin, type casting is used to convert an object from one type to another.
 * Kotlin provides two main ways to cast types:
 *      1-safe casts :-
 *                  Safe casts are performed using the as? operator.
 *                  If the cast is not successful, it returns null instead of throwing an exception.
 *                  EXAMPLE:
 *                      val obj: Any = "Hello"
 *                      val str: String? = obj as? String
 *                      println(str) // Prints: Hello
 *                      val number: Int? = obj as? Int
 *                      println(number) // Prints: null
 *
 *      2-unsafe casts:-
 *                  Unsafe casts are performed using the as operator.
 *                  If the cast is not successful, it throws a ClassCastException
 *                  EXAMPLE:
 *                      val obj: Any = "Hello"
 *                      val str: String = obj as String
 *                      println(str) // Prints: Hello
 *                      // This will throw a ClassCastException
 *                      val number: Int = obj as Int
 *
 *       3-Smart Casts:-
 *                  Kotlin also provides smart casts,
 *                  which automatically cast types based on conditions checked with is or !is.
 *                  EXAMPLES:-
 *                      fun printLength(obj: Any) {
 *                            if (obj is String) {
 *                           // Smart cast to String
 *                              println(obj.length)
 *                           } else {
 *                              println("Not a string")
 *                           }
 *                      }
 *                      printLength("Hello") // Prints: 5
 *                      printLength(123)     // Prints: Not a string
 *
 *       4-Explicit Casts:-
 *          You can also cast types explicitly using built-in functions like
 *          toInt(),toDouble(),toString(), etc.
 *          EXAMPLES:-
 *                   val doubleValue: Double = 10.5
 *                   val intValue: Int = doubleValue.toInt()
 *                   println(intValue) // Prints: 10
 *                   val intString: String = intValue.toString()
 *                   println(intString) // Prints: 10
 *                   println(doubleValue) // Prints: 10.5
 *
 * Use underscores to enhance readability for long numeric constants:
 * val oneMillion = 1_000_000
 * val idNumber = 999_99_9999L
 * val hexBytes = 0xFF_EC_DE_5E
 * val bytes = 0b11010010_01101001_10010100_10010010
 *
 * ### Strings
 * Strings are any  sequences of characters enclosed in double quotes. ==> val s1 = "hello world!"
 * They can contain escape characters (\n). ==> val s1 = "hello world!\n"
 *
 * String templates begin with a dollar sign ($) and can include variable values:
 * val name = "John"
 * println("Hello, $name") // Output: Hello, John
 * if we used ${nmae} the we can change nmae
 * we can concatenation two string as this
 *  val NumOfStudents = 1500
 *  val NumOfClasses = 2
 *  var NumOfStudentsInClass = 0
 *  println("the number of students is $NumOfStudents " + "and number of class is $NumOfClasses " + "each class has $NumOfStudentsInClass")
 *
 */

fun main() {
    // Mutable variable
    var score = 10
    score = 20 // Changing the value
    println(score) // Output: 20

    // Immutable variable
    val size = 1
    // size = 2 // Error: val cannot be reassigned

    var name: String // Declaration without initialization
    name = "John"
    println(name) // Output: John

    // Various data types
    val myNum = 5             // Int
    val myDoubleNum = 5.99    // Double
    val myLetter = 'D'        // Char
    val myBoolean = true      // Boolean
    val myText = "Hello"      // String

    println("*********************** Type Casting **************************")
    println("---------safe casting ---------")
    val obj: Any = "Hello"
    val str: String? = obj as? String
    println(str) // Prints: Hello
    val number: Int? = obj as? Int
    println(number) // Prints: null
    println("---------Unsafe casting ---------")
    val obj2: Any = "Hello"
    val str2: String = obj2 as String
    println(str2) // Prints: Hello
//  This will throw a ClassCastException
//    val number2: Int = obj as Int
//  println(number) // excption and close the programme
    println("---------SMART casting ---------")
    fun printLength(obj: Any) {
        if (obj is String) {
            println(obj.length)
        } else {
            println("Not a string")
        }
    }
    println( printLength("Hello"))
    println(printLength(123))
    println("---------Explicit Casts ---------")
    val doubleValue: Double = 10.5
    val intValue: Int = doubleValue.toInt()
    println(intValue)
    val intString: String = intValue.toString()
    println(intString)
    println(doubleValue)
    println("--------------------")
    // Assigning an Int to a Byte (will cause an error)
    val i: Int = 10
    // val b: Byte = i // Error: type mismatch: inferred type is Int but Byte was expected

    // Convert Int to Byte using casting
    val a: Int = 20
    val c = a.toByte() // Successful conversion
    println(c) // Output: 20
    println(c::class.simpleName) // Output: Byte
    println(c.javaClass) // Output: class java.lang.Byte

    // Comparison example
    val x = 10
    val y = 9
    println(x > y) // Output: true

    println("******************* Strings ************************************")
    val s1 = "Welcome to EGYPT"
    val s2 = "In EGYPT There Are Many Tourist Cities\n"
    val s3 = "Come, you will be happy!"
    val text = """
    var bikes = 50 
    """
    println(s1)
    println(s2)
    println(s3)
    println(text)

    println("**** String Concatenation ****")
    println(s1 + " " + s2) // Concatenating strings

    val numberOfDogs = 6
    val numberOfCats = 5
    println("I have ${numberOfDogs} dogs and ${numberOfCats} cats") // Using string templates
    println("I have " + numberOfDogs + " dogs and " + numberOfCats + " cats") // Concatenation

    val f = "abc"
    println("$f.length is ${f.length}") // Output: abc.length is 3

    val numberOfShirts = 10
    val numberOfPants = 5
    println("I have ${numberOfShirts + numberOfPants} items of clothing") // Output: 15 items

    var txt = "Hello World"
    println(txt[0]) // First element (H)
    println(txt[2]) // Third element (l)
}

/**Detailed Explanation
    1-Variables:
        - Variables act as named storage for data, making it easy to reference and manipulate.
        - Mutable (var): These can be changed. Use when you expect the value to change over time.
        - Immutable (val): These are constants. Use when the value should remain unchanged.

    2-Data Types:
        - Kotlin supports a variety of data types, allowing for flexibility in how data is represented and manipulated.
        - Integer Types: Commonly used for counting, indexing, etc.
        - Floating-Point Types: Used for decimal values and calculations that require precision.
        - Character and Boolean: Used for individual characters and true/false values, respectively.

    3-Type Casting:
        - Kotlin allows for explicit type conversions. If you need to convert between types (e.g., Int to Byte), you must use conversion functions.

    4-Strings:
        - Strings in Kotlin can be manipulated and formatted using string templates and concatenation.
        - They can include multi-line text and escape sequences, providing flexibility in how text data is handled.

 **/
