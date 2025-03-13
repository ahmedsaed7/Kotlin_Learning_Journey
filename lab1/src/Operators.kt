/**
 * Operators in Kotlin
 *
 * Operators are special symbols that perform operations on variables and values.
 * Kotlin supports a variety of operators, categorized as follows:
 *
 * 1. **Mathematical Operators**
 *    - Used to perform basic arithmetic operations.
 *    - Operators: `+`, `-`, `*`, `/`, `%`
 *
 *    Example:
 *        val x = 10
 *        val y = 5
 *        val sum = x + y // Addition (15)
 *        val difference = x - y // Subtraction (5)
 *        val product = x * y // Multiplication (50)
 *        val quotient = x / y // Division  (2)
 *        val remainder = x % y // Modulus  (0)
 *
 * 2. **Increment and Decrement Operators**
 *    - Used to increase or decrease a variable's value by one.
 *    - Operators: `++`, `--`
 *
 *    Example:
 *        var a = 5
 *        a++ // Increment a by 1 (a becomes 6)
 *        a-- // Decrement a by 1 (a becomes 5)
 *
 ** Post-increment (a++):
 *      The expression a++ increments the value of x by 1,
 *      but the value of the expression is the original value of x.
 *      This means that the value of x is increased after it has been used in the expression.
 *      Example:
 *          var x = 5
 *          var y = x++    // y is assigned the value 5, then x is incremented to 6
 *
 ** Pre-increment (++a):
 *      The expression ++a increments the value of x by 1,
 *      and the value of the expression is the new value of x.
 *      This means that the value of x is increased before it has been used in the expression.
 *      Example:
 *          int x = 5;
 *          int y = ++x; // x is incremented to 6, then y is assigned the value 6
 *
 ** Post-decrement (x--):
 *      The expression x-- decrements the value of x by 1,
 *      but the value of the expression is the original value of x.
 *      This means that the value of x is decreased after it has been used in the expression.
 *      Example:
 *          var x = 5
 *          var y = x--    // y is assigned the value 5, then x is decremented to 4
 *
 ** Pre-decrement (--x):
 *      The expression --x decrements the value of x by 1,
 *      and the value of the expression is the new value of x.
 *      This means that the value of x is decreased before it has been used in the expression.
 *      Example:
 *           var x = 5
 *           var y = --x    // x is decremented to 4, then y is assigned the value 4
 *
 * 3. **Comparison Operators**
 *    - Used to compare two values.
 *    - Operators: `>`, `>=`, `<`, `<=`
 *
 *    Example:
 *        val x = 10
 *        val y = 5
 *        val isGreater = x > y // true
 *        val isEqual = x == y // false
 *
 * 4. **Assignment Operator**
 *    - Used to assign values to variables.
 *    - Operator: `=`
 *
 *    Example:
 *        var z = 10 // Assigns 10 to z
 *
 * 5. **Equality Operators**
 *    - Used to check if two values are equal or not.
 *    - Operators: `==`, `!=`
 *
 *    Example:
 *        val x = 10
 *        val y = 5
 *        val isEqual = x == y // false
 *        val isNotEqual = x != y // true
 *
 * **Numeric Operator Methods**
 * Kotlin Keeps Numbers as primitives
 * Kotlin allows you to call methods on numeric types, treating them as objects.
 * This can enhance readability and allows for method chaining.
 *
 * Example of numeric operator methods:
 *      val m = x.times(y) // Equivalent to x * y
 *      val k = x.plus(y) // Equivalent to x + y
 *      val l = x.div(y) // Equivalent to x / y
 */

fun main() {
    val x = 10
    val y = 5

    // Mathematical Operators
    val sum = x + y
    println("The sum is $sum") // Output: The sum is 15

    val minus = x - y
    println("The minus is $minus") // Output: The minus is 5

    val multiply = x * y
    println("The multiply is $multiply") // Output: The multiply is 50

    val remainder = x % y
    println("The remainder is $remainder") // Output: The remainder is 0

    // Using Numeric Operator Methods
    val m = x.times(y)
    println("x.times(y) = $m") // Output: x.times(y) = 50

    val k = x.plus(y)
    println("x.plus(y) = $k") // Output: x.plus(y) = 15

    val l = x.div(y)
    println("x.div(y) = $l") // Output: x.div(y) = 2

    // Increment and Decrement Operators
    var a = 5
    a++
    println("After increment: $a") // Output: After increment: 6
    a--
    println("After decrement: $a") // Output: After decrement: 5

    // Comparison Operators
    val isGreater = x > y
    println("Is x greater than y? $isGreater") // Output: Is x greater than y? true

    // Equality Operators
    val isEqual = x == y
    println("Is x equal to y? $isEqual") // Output: Is x equal to y? false

    val isNotEqual = x != y
    println("Is x not equal to y? $isNotEqual") // Output: Is x not equal to y? true
}

/** Detailed Explanation of Operators: -
    1-Mathematical Operators:
        - Addition (+): Adds two numbers.
        - Subtraction (-): Subtracts the second number from the first.
        - Multiplication (*): Multiplies two numbers.
        - Division (/): Divides the first number by the second.
        - Modulus (%): Returns the remainder of the division.

    2-Increment and Decrement Operators:
        - Increment (++): Increases the value of a variable by one. Can be used as a prefix (++a) or postfix (a++).
        - Decrement (--): Decreases the value of a variable by one. Can also be used as a prefix or postfix.

    3-Comparison Operators:
        - Used to compare values and return a Boolean result (true or false).
        - Useful in control flow statements like if or when.

    4-Assignment Operator:
        - Assigns the value on the right to the variable on the left.

    5-Equality Operators:
        - Equality (==): Checks if two values are equal.
        - Inequality (!=): Checks if two values are not equal.

    6-Numeric Operator Methods:
        - In addition to using operators, Kotlin allows calling methods on numeric types, which can make some operations more explicit.
        - Methods like plus(), minus(), times(), div(), and rem() (for modulus) can be used in place of operators.


    ## Best Practices:
        1- Readability: Use operator methods for better readability in complex expressions.
        2- Clear Intent: Use appropriate comparison operators to ensure code clarity.
        3- Avoid Overusing Operators: While operators can make code concise, overusing them can lead to confusion; aim for balance
 * */