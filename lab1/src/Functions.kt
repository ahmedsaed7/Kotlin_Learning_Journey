/**
 * Functions in Kotlin
 *
 * A function is a reusable block of code that performs a specific task.
 * In Kotlin, functions can take parameters, return values, and be defined in various ways.
 *
 * ** Function Definition **
 * The function definition begins with the keyword `fun`.
 *
 * ** Function Keyword: **
 * The keyword `fun` indicates that you are defining a function. It (must be) in lowercase.
 * You can't use alternative spellings like `func` or `function`.
 *
 * ** Syntax Overview: **
 * 1. Function with No Return Value:
 *    Syntax:
 *        fun functionName(input: Type) {
 *            // function body
 *        }
 *    - If no return type is specified, the function returns `Unit` by default.
 *    - The Unit return type declaration is optional.
 *
 *
 *    Example:
 *        fun greet() {
 *            println("Hello, World!")
 *        }
 *
 * 2. Function with a Return Value:
 *    Syntax:
 *        fun functionName(input: Type): ReturnType {
 *            // function body
 *            return value
 *        }
 *
 *    Example:
 *        fun sum(a: Int, b: Int): Int {
 *            return a + b
 *        }
 *
 * 3. Function with Parameters:
 *    Functions can accept one or more parameters.
 *
 *    Example:
 *        fun personalizedGreeting(name: String): String {
 *            return "Hello, $name!"
 *        }
 *
 * 4. Functions with Multiple Parameters:
 *    You can define functions with parameters of different types.
 *
 *    Example:
 *        fun birthdayGreeting(name: String, age: Int): String {
 *            return "Happy Birthday, $name! You are now $age years old!"
 *        }
 *
 * ** Default parameters ==> Default values provide a fallback if no parameter value is passed.
 * ** Required parameters ==> If no default is specified for a parameter, the corresponding argument is required.
 * ** Default versus required parameters ==> Functions can have a mix of default and required parameters.
 * ** Named arguments ==> To improve readability, use named arguments for required arguments.
 *      -- reformat (str, divideByCamelHumps = false, wordSeparator = '_')
 *      -- It's considered good style to put default arguments after positional arguments,
 *         that way callers only have to specify the required arguments.
 *
 * ** Compact functions ==> Compact functions, or single-expression functions, make your code more concise and readable.
 *      - fun functionName(input: Type):ReturnType = body of function    ==> complete function
 *
 *          Example ==> fun double(x:Int):Int = x * 2 ==> compact function
 *
 *
 * ** Parameter Immutability **
 *      Parameters in Kotlin are immutable. You cannot change their values inside the function body.
 * ** Function Overloading **
 * Kotlin supports function overloading, allowing multiple functions with the same name but different parameters.
 *
 *    Example:
 *        fun display(value: Int) {
 *            println("Integer value: $value")
 *        }
 *
 *        Fun display(value: String) {
 *            println("String value: $value")
 *        }
 *
 *
 * Kotlin functions are first-class
 * Kotlin functions can be stored in variables and data structures
 *
 *
 * ** Higher-Order Functions **
 * Functions can take other functions as parameters or return functions.
 * You can use higher-order functions to create new "built-in" functions
 * They can be passed as arguments to, and returned from, other higher-order functions
 *
 *    Example:
 *        fun operateOnNumbers(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
 *            return operation(a, b)
 *        }
 *
 *        fun sum(a: Int, b: Int): Int {
 *             return a + b
 *        }
 *
 *        Val result = operateOnNumbers(3, 4, ::sum)
 *
 *        println("Result: $result") // Output: Result: 7
 *

 *
 * ** Lambdas Functions **
 *       - A lambda is an expression that makes a function that has no name.
 *       - val Variable_name = {parameter:datatype function arrow (->) Code to execute}
 *         println(Variable name(number)) or
 *
 * ** Passing a function reference
 *      - Use the :: operator to pass a named function as an argument to another function
 *
 * ** List filters
 *      - Get part of a list based on some condition
 *      - The filter condition in curly braces {} tests each item as the filter loops through. If the expression returns true, the item is included.
 * ** Eager and lazy filters
 * - Eager: occurs regardless of whether the result is ever used
 * - Lazy: occurs only if necessary at runtime
 * Lazy evaluation of lists is useful if you don't need the entire result, or if the list is exceptionally large and multiple copies wouldn't fit into RAM.
 *
 * ** Map()
 *  - map ==> performs the same transform on every item and returns the list.
 *
 *
 */

fun main() {

    // Calling various functions
    print("-----------------------1----------------------\n")
    greet()

    print("------------------------2---------------------\n")
    val num1 = 10
    val num2 = 20
    println("The sum is: ${sum(num1, num2)}")

    print("------------------------3---------------------\n")
    println(personalizedGreeting("Alice"))

    print("------------------------4---------------------\n")
    println(birthdayGreeting("Rover", 5))

    print("------------------------5---------------------\n")
    // Demonstrating function overloading
    display(42)
    display("Hello Kotlin")

    print("------------------------6---------------------\n")
    // Using higher-order functions
    val result = operateOnNumbers(3, 4, ::sum)
    println("Result of operation: $result") // Output: Result of operation: 7

    print("------------------------7---------------------\n")
    println(drive("fast"))

    print("------------------------8---------------------\n")
    println(login("ahmed" , "mohamed"))
    print("------------------------9---------------------\n")
    println(reformat(10,"may",'a',false,true))
    println(reformat(5,"jun",'b',true))
    print("------------------------10---------------------\n")
    println(increaing(10))
    print("-----------------------lambda---------------------\n")
    var dirtLevel = 20
    val waterFilter = {level: Int -> level / 2}
    println(waterFilter(dirtLevel))

    val multiplyByTwo:(Int) -> Int={ 2 * it }
    val multiplyByThree = { number:Int -> number*3 }
    println(multiplyByThree(3))
    println(multiplyByTwo(4))
    println(times(4 , {it*5}))
    //You can pass a lambda as a function parameter without putting it inside the parentheses.
    val x = times(3){it*9}
    println(x)
    print("------------------------11---------------------\n")
    val enc1: (String) -> String = { input -> input.toUpperCase() }
    println(encodeMsg("abc", enc1))
    println(encodeMsg("abc", ::enc2))

    print("------------------------12---------------------\n")
    repeat(3) { index ->
        println("Hello $index")
    }
    print("------------------------13---------------------\n")
    val list = (0 .. 100 ).toList()
    val  filtered = list.filter { it>50 }
    println(filtered +"\n")
    val  filtered2 = list.myFilter{ it%2 == 0 }
    println(filtered2 +"\n")

    val books = listOf("nature", "biology", "birds")
    println(books.filter { it[0] == 'b' })

    //Filters are eager by default. A new list is created each time you use a filter.
    val instruments = listOf("viola", "cello", "violin")
    val eager = instruments.filter{ it [0] == 'v' }
    println("eager: " + eager)

    // Sequences are data structures that use lazy evaluation, and can be used with filters to make them lazy.
    val instruments2 = listOf("viola", "cello", "violin")
    val filtered3 = instruments2.asSequence().filter { it[0] == 'v'}
    println("filtered: " + filtered3)
    // Sequences can be turned back into lists using toList().
    println("filtered: " + filtered3.toList())
    print("------------------------14---------------------\n")
    val numbers = setOf(1, 2, 3)
    println(numbers.map { it * 3 })
    println(numbers)
    print("------------------------15---------------------\n")
    val numberSets = listOf(setOf(1, 2, 3), setOf(4, 5), setOf(1, 2))
    println(numberSets.flatten())
    print("------------------------16---------------------\n")
    val ints = listOf(1,2,3,4)
    val postive = ints.filter { it > 0 }
    print (postive)
    print("\n"+ints.filter { n: Int -> n > 0 })
    print("\n"+ints.filter{n -> n > 0})
    print("\n------------------------17---------------------\n")
    val Numbers = setOf(1,2,3,4)
    println(Numbers)
    println(Numbers.map { it * 3 })
    println(Numbers)
    print("\n------------------------18---------------------\n")
    val nums = listOf(setOf(1, 2, 3), setOf(4, 5), setOf(1, 2))
    println(nums)
    println(nums.flatten())

}

inline fun repeat(times: Int, action: (Int) -> Unit) {
    for (i in 0 until times) {
        action(i)
    }
}

fun List<Int>.myFilter(operate: (Int) -> Boolean): MutableList<Int> {
    val temp = mutableListOf<Int>()
    for (element in this) {
        if (operate(element))
            temp.add(element)

    }
    return temp
}

fun encodeMsg(msg: String, encode: (String) -> String): String {
    return encode(msg)
}

// Function with no return value
fun greet() {
    println("Hello, World!")
}
// Function that returns the sum of two integers
fun sum(a: Int, b: Int): Int {
    return a + b
}
// Function that returns a personalized greeting
fun personalizedGreeting(name: String): String {
    return "Hello, $name!"
}
// Function that returns a birthday greeting
fun birthdayGreeting(name: String, age: Int): String {
    return "Happy Birthday, $name! You are now $age years old!"
}
// Function overloading examples
fun display(value: Int) {
    println("Integer value: $value")
}
fun display(value: String) {
    println("String value: $value")
}
// Higher-order function example
fun operateOnNumbers(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}
//Default parameters
fun drive(speed:String = "no argument is passed"){
    println(speed)
}
//Required parameters
fun login(firstName: String,lastName: String) {
    println("welcome $firstName $lastName ")
}
//Default versus required parameters
fun reformat(day : Int , month : String , char: Char,me:Boolean ,boolean: Boolean = false ) {
        println(day)
        println(month)
        println(char)
        println(me)
        println(boolean)
        println("###########")
}
//Compact functions
fun increaing(number : Int): Int = number + 1

fun  times (number:Int , timesLamda:(Int) -> Int ) = timesLamda(number)

fun enc2(input:String): String = input.reversed()




/** Additional Information and Examples: -
    * Function Basics:
    *
    * Functions are fundamental building blocks in programming. They help in organizing code and promoting reuse.
    * Each function can have a clear purpose, which simplifies debugging and maintenance.
    * Return Types:
    *
    * Functions can explicitly specify a return type. If omitted, Kotlin defaults to Unit.
    * Example of explicit return type:

         - fun multiply(a: Int, b: Int): Int {
         - return a * b
         - }
    * Function Parameters:
    *
    * Parameters must have specified types.
    * Multiple parameters can be defined with different types:


        - fun calculateArea(length: Double, width: Double): Double {
        - return length * width
        - }
    * Using Default Parameter Values:
    *
    * Kotlin allows you to specify default values for parameters.



        - fun greet(name: String = "Guest"): String {
        - return "Hello, $name!"
        - }
    * This allows you to call greet() without any arguments, defaulting to "Guest".
    * Function Overloading:
    *
    * Overloading allows defining functions with the same name but different parameters.
    * This can enhance code readability:
     *
        - fun show(value: Int) { println("Integer: $value") }
        - fun show(value: Double) { println("Double: $value") }
    * Higher-Order Functions:
    *
    * Functions can take other functions as parameters or return them, allowing for functional programming paradigms.
    * Example of returning a function:


    - fun multiplyBy(factor: Int): (Int) -> Int {
    - return { number -> number * factor }
    - }
    - val double = multiplyBy(2)
    - println(double(5)) // Output: 10
    * Lambda Expressions:
    *
    * Kotlin supports lambda expressions, which are essentially anonymous functions.

          - val square: (Int) -> Int = { x -> x * x }
     *     - println(square(4)) // Output: 16
     *
     *
     ** Best Practices
     1- Naming Conventions: Use descriptive names for functions and parameters to make the code self-documenting.
     2- Single Responsibility: Each function should have one responsibility, promoting clarity and maintainability.
     3- Documentation: Comment your functions to explain their purpose and usage, especially for public APIs.
     4- Testing: Write unit tests for your functions to ensure they work as expected and handle edge cases.
*/