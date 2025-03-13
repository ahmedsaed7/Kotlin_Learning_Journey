/**
 * Kotlin Collections: Lists and Arrays
 *
 * This code illustrates the usage of Lists and Arrays in Kotlin, including:
 * 1. Immutable and Mutable Lists
 * 2. Arrays with fixed size and mixed types
 * 3. Accessing and manipulating elements in both structures
 *
 * 1. Lists:
 *    - Lists are ordered collections of elements.
 *    - List elements can be accessed programmatically through their indices.
 *    - Elements in a list can occur more than once.
 *
 *    a. Immutable List using listOf():
 *       - You can declare an immutable list using the listOf() function.
 *       - Example: val cars = listOf("trumpet", "piano", "violin")
 *
 *    b. Mutable List using mutableListOf():
 *       - Lists can be modified using mutableListOf().
 *       - Example: val myList = mutableListOf("trumpet", "piano", "violin")
 *       - Note: With a list defined with val, you can't change the reference of the variable,
 *         but you can still change the contents of the list.
 *
 * 2. Arrays:
 *    - Arrays store multiple items and their elements can be accessed through their indices.
 *    - Array elements are mutable, but the size of an array is fixed once created.
 *
 *    a. Array using arrayOf():
 *       - An array can be created using the arrayOf() function.
 *       - Example: val pets = arrayOf("dog", "cat", "canary")
 *       - Note: Similar to lists, with an array defined with val, you can't change the reference,
 *         but you can change its contents.
 *
 *    b. Arrays with Mixed or Single Types:
 *       - An array can contain different types: val mix = arrayOf("hats", 2)
 *       - An array can also contain just one type: val numbers = intArrayOf(1, 2, 3)
 *
 *    c. Combining Arrays:
 *       - You can combine arrays using the + operator.
 *
 * Additional Notes:
 * - Remember that arrays in Kotlin are based on Java arrays, hence the default string representation
 *   might not be intuitive. Use contentToString() to get a readable output.
 */

fun main() {
    // ********************* Immutable List *********************
    val cars = listOf("trumpet", "piano", "violin")
    println("Immutable List: $cars") // Outputs the list of cars
    println("Size of the list: ${cars.size}") // Outputs the size of the list
    println("Element at index 2: ${cars[2]}") // Accessing the element at index 2

    println("---------------------------------")

    // ********************* Mutable List *********************
    val myList = mutableListOf("trumpet", "piano", "violin")
    myList.add("BMW") // Adding a new element to the mutable list
    println("Mutable List after adding BMW: $myList")
    println("Size of the mutable list: ${myList.size}")

    println("----------------------------------")

    // ********************* Arrays *********************
    val pets = arrayOf("dog", "cat", "canary")
    println("Array of pets (raw): $pets")
    /*
     * The output is ==> [Ljava.lang.String;@4d405ef7
     * This output is the default string representation of an array in Java (and Kotlin).
     * [ indicates that it is an array.
     * L signifies that it contains objects (in this case, String).
     * java.lang.String is the type of the elements in the array.
     * @4d405ef7 is the memory address of the array object, specific to that instance.
     * To print the contents of the array in a more readable format, you can use contentToString().
     */
    println("Contents of pets array: ${pets.contentToString()}") // Readable output of the array
    println("Size of pets array: ${pets.size}") // Outputs the size of the array
    println("Element at index 2: ${pets.get(2)}") // Accessing the element at index 2
    println("Contents of pets array: " +java.util.Arrays.toString(pets))
    println("---------------------------------")

    // ********************* Combining Arrays *********************
    val numbers = intArrayOf(1, 2, 3) // Array of integers
    val numbers2 = intArrayOf(4, 5, 6) // Another array of integers
    val combined = numbers + numbers2 // Combining arrays using + operator
    println("Combined Array: ${combined.joinToString()}") // Outputs the combined array

    /*
     * The output will show the contents of the combined array.
     * Using joinToString() gives a more readable representation than the default array output.
     */
}
/** Additional Information and Notes: -
* Comments: Each section has clear comments that explain the purpose of the code, enhancing readability and understanding.
* Structure: The code is organized into sections for lists and arrays, making it easy to follow and reference.
* Output Explanation: Included explanations of the output for better understanding, especially regarding default array representations.
* Usage of Functions: Demonstrated the use of contentToString() and joinToString() for displaying array contents in a more user-friendly manner.
* Best Practices: Emphasized the immutability of lists and arrays declared with val, reinforcing the importance of understanding how Kotlin handles references.
 * */