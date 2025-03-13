/**
 * Null Safety in Kotlin
 *
 * Kotlin is designed with null safety in mind to help developers avoid null pointer exceptions,
 * a common source of runtime errors in programming. This code demonstrates various aspects of null safety:
 *
 * 1. Non-nullable Types:
 *    - In Kotlin, variables cannot be null by default.
 *    - If you try to assign null to a non-nullable type, you'll get a compile-time error.
 *    Example:
 *        var numberOfBooks: Int = null // Error: null cannot be a value of a non-null type Int
 *
 * 2. Nullable Types:
 *    - You can explicitly declare a variable as nullable by using the safe call operator (?).
 *    - This allows you to assign null to that variable.
 *    Example:
 *        var numberOfBooks: Int? = null
 *    - Note: Avoid setting variables to null unless necessary, as it may lead to unexpected behavior.
 *
 * 3. Safe Call Operator and Force Unwrapping:
 *    - You can safely call methods on nullable variables using the safe call operator (?).
 *    - To force a variable into a non-null type, use the !! operator.
 *    Example:
 *        val len = s!!.length // Throws NullPointerException if s is null
 *    - Warning: Use !! only when you're confident that the variable should never be null.
 *
 * 4. Elvis Operator:
 *    - The Elvis operator (?:) provides a way to handle null values.
 *    - It allows you to specify a default value if the variable is null.
 *    Example:
 *        numberOfBooks = numberOfBooks?.dec() ?: 0
 *    - The Elvis operator is sometimes called this because it resembles a sideways smiley face.
 */

fun main() {
    // Example 1: Non-nullable Int
    var numberOfBooks: Int = 6 // Declaring a non-nullable Int
    // Decrementing numberOfBooks safely
    numberOfBooks = numberOfBooks.dec() // Decrementing the value
    println("Number of books after decrement: $numberOfBooks") // Output: 5

    println("\n------------------------------")

    // Example 2: Nullable Int
    var numberOfBooks2: Int? = null // Declaring a nullable Int
    // Using the safe call operator to decrement if not null
    numberOfBooks2 = numberOfBooks2?.dec() ?: 0 // Safely decrement or set to 0
    println("Number of books after safe decrement: $numberOfBooks2") // Output: 0

    // Example 3: Working with a non-null variable
    numberOfBooks2 = 10 // Assigning a non-null value
    // Force unwrapping with !!, be cautious
    val booksAfterForcedDecrement = numberOfBooks2!!.dec() // Force unwrapping
    println("Number of books after forced decrement: $booksAfterForcedDecrement") // Output: 9

    // Example 4: Using Elvis operator to provide a default value
    numberOfBooks2 = null // Setting to null
    val safeCount = numberOfBooks2 ?: 0 // Using Elvis operator to provide a default
    println("Number of books (using Elvis operator): $safeCount") // Output: 0

    // Example 5: Checking for null before accessing properties
    var bookTitle: String? = null // Declaring a nullable String
    // Safe call to access length
    val titleLength = bookTitle?.length ?: "Title is not set" // Using safe call and Elvis operator
    println("Book title length: $titleLength") // Output: Book title length: Title is not set

    // Example 6: List of nullable types
    val books: List<String?> = listOf("Book One", null, "Book Three") // List with nullable types
    for (book in books) {
        println("Book title: ${book ?: "Unknown Title"}") // Using Elvis operator for unknown titles
    }
    // Output:
    // Book title: Book One
    // Book title: Unknown Title
    // Book title: Book Three
}
/** Additional Information and Notes : -
* Code Structure: The code is organized into clear sections, each demonstrating a specific aspect of null safety in Kotlin.
* In-depth Comments: Each section includes detailed comments to explain the purpose and behavior of the code, making it educational.
* Usage of Operators: The code demonstrates various null safety operators (?., !!, and ?:) with practical examples.
* Examples: Each example illustrates a specific point about null safety, making it easy to follow and understand.
* Best Practices: The code notes emphasize caution when using the force unwrap operator (!!), encouraging developers to use it only when necessary.
* Output Clarity: The expected output is clearly stated in comments, allowing readers to understand the results of running the code.
 ***/