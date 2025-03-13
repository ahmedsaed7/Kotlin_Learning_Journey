/**
 * Conditionals and Loops in Kotlin
 *
 * This code demonstrates various control flow constructs in Kotlin, including:
 * 1. If/Else Statements
 * 2. When Expressions
 * 3. For Loops
 * 4. While Loops
 * 5. Do While Loops
 * 6. Repeat Loops
 *
 * Each section includes examples, best practices, and explanations of syntax.
 *
 * 1. If/Else Statements
 *    - The if statement evaluates a condition and executes a block of code if the condition is true.
 *    - The else if-clause allows for additional conditions to be checked.
 *    - The else clause executes if none of the preceding conditions are true.
 *
 *    Syntax:
 *        if (condition1) {
 *            // Code executed if condition1 is true
 *        } else if (condition2) {
 *            // Code executed if condition1 is false and condition2 is true
 *        } else {
 *            // Code executed if both conditions are false
 *        }
 *
 *    Best Practices:
 *    - Use descriptive variable names for conditions to enhance readability.
 *    - Avoid deeply nested if statements to maintain code clarity.
 *
 * 2. When Statements
 *    - The when expression is a more powerful and expressive alternative to if-else chains.
 *    - It allows matching against values, ranges, and can even include type checks.
 *
 *    Example:
 *        when (value) {
 *            1 -> "One"
 *            in 2..5 -> "Between Two and Five"
 *            is String -> "It's a string"
 *            else -> "Something else"
 *        }
 *        when () {
 *              x == 1 && y == 2 -> "yes"
 *              x == 1 || y ==2 -> "false"
 *              else -> "no thing"
 *          }
 *
 * 3. For Loops
 *    - Used to iterate over a collection (like arrays) or a range.
 *    - The syntax is straightforward and eliminates the need for managing index variables manually.
 *
 *    Syntax:
 *        for (item in collection) {
 *            // Code block
 *        }
 *    - you don't need to define an iterator variable and increment it for each pass.
 * 4. While Loops
 *    - Repeatedly executes a block of code as long as a specified condition is true.
 *    - Useful when the number of iterations is not known beforehand.
 *
 *    Syntax:
 *        while (condition) {
 *            // Code block
 *        }
 *
 * 5. Do While Loops
 *    - Similar to while loops, but guarantees that the code block is executed at least once.
 *
 *    Syntax:
 *        do {
 *            // Code block
 *        } while (condition)
 *
 * 6. Repeat Loops
 *    - Executes a block of code a specific number of times.
 *
 *    Syntax:
 *        repeat(times) {
 *            // Code block
 *        }
 *
 * ## Range ##
 * A range in Kotlin is a sequence of values defined by a start value,
 * an end value, and a step. It is a convenient way to represent a span of comparable values.
 * Ranges are commonly used in loops, conditional statements, and collections.
 *
 * Creating Ranges
 * Ranges in Kotlin can be created using the .. operator,
 * Example:
 *          val range = 1..10 // Range from 1 to 10 inclusive
 *
 * rangeTo() function, or predefined range functions.
 * Example:
 *          val range = 1.rangeTo(10) // Range from 1 to 10 inclusive
 *
 * Types of Ranges:-
 *          1-Closed Ranges:
 *               Include both the start and end values.
 *               val range = 1..10 // Includes 1 to 10
 *          2-Half-Open Ranges:
 *               Exclude the end value. These are commonly used with the until function.
 *               val range = 1 until 10 // Includes 1 to 9
 *          3-Downward Ranges:
 *               These use the downTo function to create ranges in descending order.
 *               val range = 10 downTo 1 // Includes 10 to 1
 *          4-Stepped Ranges:
 *               These use the step function to define the interval between values.
 *               val range = 1..10 step 2 // Includes 1, 3, 5, 7, 9
 *               val downRange = 10 downTo 1 step 2
 *
 *Note that ==> there are no spaces around the "range to" operator  (1..100)
 */

fun main() {
    // ********************* If/Else Statements *********************
    println("********************* If/Else Statements *********************")

    val time = 22 // Represents the current hour
    if (time < 10) {
        println("Good morning.")
    } else if (time < 20) {
        println("Good day.")
    } else {
        println("Good evening.")
    }

    // Example of guests condition
    val guests = 30
    if (guests == 0) {
        println("No guests")
    } else if (guests < 20) {
        println("Small group of people")
    } else {
        println("Large group of people!")
    }

    // ********************* Range in If/Else Statements *********************
    println("********************* Range in If/Else Statements *********************")
    val numberOfStudents = 50
    // Check if within the range 1 to 100
    if (numberOfStudents in 1..100) {
        println("Number of students: $numberOfStudents") // Valid range
    } else {
        println("Number of students is out of expected range.")
    }

    // ********************* If/Else Statements as Expressions *********************
    println("********************* If/Else Statements as Expressions *********************")
    val time2 = 5
    // Using if as an expression to assign a value
    val greeting = if (time2 < 18) {
        "Good day."
    } else {
        "Good evening."
    }
    println(greeting)

    // Omitting curly braces for single statements
    val time3 = 20
    val greeting3 = if (time3 < 18) "Good day." else "Good evening."
    println(greeting3)

    // ********************* When Statement *********************
    println("********************* When Statement *********************")
    val day = 4
    // Using when to map a number to a day of the week
    val result = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day." // Default case
    }
    println(result)

    // Example of when with ranges
    val results2 = 22
    when (results2) {
        0 -> println("No results")
        in 1..39 -> println("Got results!") // Range condition
        else -> println("That's a lot of results!") // Handles larger values
    }

    // ********************* While Loop Statement *********************
    println("********************* While Loop Statement *********************")
    var i = 0
    // While loop that prints numbers from 0 to 4
    while (i < 5) {
        println(i) // Prints 0 to 4
        i++ // Incrementing i
    }

    println("----------------------")
    var j = 10
    // Do while loop guarantees execution at least once
    do {
        println(j) // Prints 10 (at least once)
        j++
    } while (j < 15)

    println("----------------------")
    var k = 90
    // While loop with a break statement
    while (k < 100) {
        println(k)
        k++
        if (k == 94) {
            break // Exits the loop when k equals 94
        }
    }

    println("----------------------")
    var u = 100
    // While loop demonstrating continue statement
    while (u < 110) {
        if (u == 104) {
            u++ // Skip 104
            continue // Continues with the next iteration
        }
        println(u) // Prints numbers except 104
        u++ // Incrementing u
    }

    // ********************* For Loop Statement *********************
    println("********************* For Loop Statement *********************")
    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")

    for (x in cars) {
        println(x) // Prints each car brand
    }

    // For loop with simple arithmetic operation
    println("-------------------")
    val nums = arrayOf(1, 5, 10, 15, 20)
    for (x in nums) {
        println(x + 1) // Prints each number incremented by 1
    }
    println(nums.contentToString()) // Displays the original array

    // For loop with index
    println("-----------------------------")
    val pets = arrayOf("dog", "cat", "canary")
    for ((index, element) in pets.withIndex()) {
        println("Item at $index is $element") // Prints index and element
    }

    // ********************* Range Loops *********************
    println("-----------------------------")
    // Simple range loops
    for (i in 1..5) print(i) // Prints 12345
    println("\n")
    for (i in 5 downTo 1) print(i) // Prints 54321
    println("\n")
    for (i in 3..6 step 2) print(i) // Prints 35
    println("\n")
    for (i in 'd'..'g') print(i) // Prints defg
    println("\n")

    // ********************* Repeat Loop Statement *********************
    println("********************* Repeat Loop Statement *********************")
    repeat(2) {
        print("Hello!") // Prints "Hello!" twice
    }
}
/** Additional Information and Notes: -

* Code Structure: The code is organized into clear sections, each demonstrating a specific control flow construct in Kotlin.
 *  In-depth Comments: Each section includes detailed comments explaining the purpose and behavior of the code, making it educational.
 * Examples and Output: Each example is designed to be self-contained, showing not only how to use the constructs but also what to expect as output.
 * Best Practices: The code emphasizes best practices for writing clear and maintainable conditional and loop constructs.
 * Range Handling: Demonstrates how to work with ranges and includes examples that leverage Kotlin's concise syntax for range expressions.
 * Comprehensive Coverage: The code covers all major control flow constructs in Kotlin, making it a valuable resource for beginners and intermediate learners.
 * */