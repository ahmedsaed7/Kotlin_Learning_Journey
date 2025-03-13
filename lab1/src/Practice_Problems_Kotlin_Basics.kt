
/**
 * 1-Print messages:
 * Tell your friends what you learned in this pathway.
 * Can you write a main() function that prints these messages on four separate lines?
      - Use the val keyword when the value doesn't change.
      - Use the var keyword when the value can change.
      - When you define a function, you define the parameters that can be passed to it.
      - When you call a function, you pass arguments for the parameters.
 *
 *
 * 2-Fix compile error
 * This program prints a message that notifies the user that they received a chat message from a friend.
     fun main() {
        println("New chat message from a friend'}
     }
 *
 *
 * 3-String templates
 * This program informs users about the upcoming promotional sale on a particular item.
 * It has a string template, which relies on the discountPercentage variable for the percent
 * discount and the item variable for the item on sale.
 * However, there are compilation errors in the code.
        fun main() {
        val discountPercentage: Int = 0
        val offer: String = ""
        val item = "Google Chromecast"
        discountPercentage = 20
        offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"

        println(offer)
        }
 *
 *
 * 4-String concatenation
 * This program displays the total party size. There are adults and kids at the party.
 * The numberOfAdults variable holds the number of adults at the party and the numberOfKids
 * variable holds the number of kids.
    fun main() {
    val numberOfAdults = "20"
    val numberOfKids = "30"
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
    }
 *
 *
 * 5-Message formatting
 * This program displays the total salary that an employee receives this month.
 * The total salary is divided in two parts: the baseSalary variable,
 * which the employee receives every month, and the bonusAmount variable,
 * which is an additional bonus awarded to the employee.
    fun main() {
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = "$baseSalary + $bonusAmount"
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
    }
 *
 *
 * 6-Implement basic math operations
 * In this exercise, you write a program that performs basic math operations and prints the output.
 * Step 1
 * This main() function contains one compile error:
         fun main() {
             val firstNumber = 10
             val secondNumber = 5
             println("$firstNumber + $secondNumber = $result")
         }
 * Can you fix the error so that the program prints this output? 10 + 5 = 15.
 * the error in result because you don't declare variable name result .
 * Step 2
 * The code works, but the logic for adding two numbers is located within the result variable,
 * making your code less flexible to reuse. Instead, you can extract the addition operation into
 * an add() function so that the code is reusable. To do this, update your code with the code
 * listed below. Notice that the code now introduces a new val called thirdNumber and prints
 * the result of this new variable with firstNumber.
 *
             fun main() {
                 val firstNumber = 10
                 val secondNumber = 5
                 val thirdNumber = 8

                 val result = add(firstNumber, secondNumber)
                 val anotherResult = add(firstNumber, thirdNumber)

                 println("$firstNumber + $secondNumber = $result")
                 println("$firstNumber + $thirdNumber = $anotherResult")
             }
 *
 * // Define add() function below this line
 * Can you define the add() function so that the program prints this output?
 *
 * 10 + 5 = 15
 * 10 + 8 = 18
 * Step 3
 * Now you have a reusable function to add two numbers.
 *
 * Can you implement the subtract() function the same way you implemented the add() function?
 * Modify the main() function as well to use the subtract() function so you can verify
 * that it works as expected.
 * Hint: Think about the difference between addition, subtraction and other math operations.
 * Start work on the solution code from their
 *
 *
 * 9-Compare two numbers
 * Modern mobile phones have a built-in feature that tracks screen time,
 * or the time you spend on your phone each day.
 * In this exercise, you implement a function that compares the time in minutes that you spent on
 * your phone today versus the time spent yesterday.
 * The function accepts two integer parameters and returns a boolean value.
 * The first parameter holds the number of minutes that you spent today, and the second parameter
 * holds the number of minutes that you spent yesterday.
 * The function returns a true value if you spent more time on the phone today compared to
 * yesterday. Otherwise, it returns a false value.
 *
 * For example, if you called the function with these named arguments:
 *
 * timeSpentToday = 300 and timeSpentYesterday = 250, the function returns a true value.
 * timeSpentToday = 300 and timeSpentYesterday = 300, the function returns a false value.
 * timeSpentToday = 200 and timeSpentYesterday = 220, the function returns a false value.
 * Hint: The > comparison operator returns a true value if the value before the operator is greater than the value after it. Otherwise, it returns a false value.
 *
 * 10-Move duplicate code into a function
 * This program displays the weather for different cities.
 * It includes the city name, the high and low temperature for the day, and the chance of rain.
 * There are many similarities in the code that prints the weather for each city. For example,
 * there are phrases that are repeated multiple times, such as "City:" and "Low temperature."
 * Similarly, repeated code creates the risk of errors in your program. For one of the cities,
 * you may have a typo, or you may forget one of the weather details.
 *
 * Can you create a function that prints the weather details for a single city to reduce the
 * repetition in the main() function and then do the same for the remaining cities?
 * Can you update the main() function to call the function that you created for each city and
 * pass in the appropriate weather details as arguments?
        fun main() {
            println("City: Ankara")
            println("Low temperature: 27, High temperature: 31")
            println("Chance of rain: 82%")
            println()
            println("City: Tokyo")
            println("Low temperature: 32, High temperature: 36")
            println("Chance of rain: 10%")
            println()
            println("City: Cape Town")
            println("Low temperature: 59, High temperature: 64")
            println("Chance of rain: 2%")
            println()
            println("City: Guatemala City")
            println("Low temperature: 50, High temperature: 55")
            println("Chance of rain: 7%")
            println()
        }
 * */
fun main(){
    println("----------------1---------------")
    println("Use the val keyword when the value doesn't change")
    println("Use the var keyword when the value can change.")
    println("When you define a function, you define the parameters that can be passed to it.")
    println("When you call a function, you pass arguments for the parameters.")

    println("----------------2---------------")
    println("New chat message from a friend")

    println("----------------3---------------")
    var discountPercentage: Int = 0
    var offer: String = ""
    val item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"
    println(offer)

    println("----------------4---------------")
    val numberOfAdults = "20"
    val numberOfKids = "30"
    val total = numberOfAdults.toInt() + numberOfKids.toInt()
    println("The total party size is: $total")

    println("----------------5---------------")
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = baseSalary + bonusAmount
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")

    println("----------------6 step 1 ---------------")
    val firstNumber = 10
    val secondNumber = 5
    val result = firstNumber + secondNumber
    println("$firstNumber + $secondNumber = $result")

    println("----------------6 step 2 ---------------")
    val firstNumber2 = 10
    val secondNumber2 = 5
    val thirdNumber = 8
    val result2 = add(firstNumber2, secondNumber2)
    val anotherResult = add(firstNumber2, thirdNumber)
    println("$firstNumber2 + $secondNumber2 = $result2")
    println("$firstNumber2 + $thirdNumber = $anotherResult")

    println("----------------6 step 2 ---------------")
    val firstNumber3 = 10
    val secondNumber3 = 5
    val thirdNumber3 = 8
    val result3 = subtract(firstNumber3, secondNumber3)
    val anotherResult3 = subtract(firstNumber3, thirdNumber3)
    println("$firstNumber3 - $secondNumber3 = $result3")
    println("$firstNumber3 - $thirdNumber3 = $anotherResult3")

    println("----------------7---------------")
    val firstUserEmailId = "user_one@gmail.com"
    // The following line of code assumes that you named your parameter as emailId.
    // If you named it differently, feel free to update the name.
    println(displayAlertMessage(emailId = firstUserEmailId))
    println()
    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"
    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
    println()
    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"
    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()

    println("----------------8---------------")
    val Steps = 4000
    val caloriesBurned = PEDOMETERstepsTOcalories(Steps);
    println("Walking $Steps steps burns $caloriesBurned calories")

    println("----------------9---------------")
    val timeSpentToday = 300
    val timeSpentYesterday = 250
    println(hasSpentMoreTimeToday(timeSpentToday, timeSpentYesterday)) // Should print true
    val anotherTimeSpentToday = 200
    val anotherTimeSpentYesterday = 220
    println(hasSpentMoreTimeToday(anotherTimeSpentToday, anotherTimeSpentYesterday)) // Should print false

    println("----------------10---------------")
    printWeatherDetails("Ankara", 27, 31, 82)
    println()
    printWeatherDetails("Tokyo", 32, 36, 10)
    println()
    printWeatherDetails("Cape Town", 59, 64, 2)
    println()
    printWeatherDetails("Guatemala City", 50, 55, 7)
}




fun add(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber + secondNumber
}

fun subtract(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber - secondNumber
}

// Define your displayAlertMessage() below this line.
fun displayAlertMessage(emailId: String, operatingSystem: String = "Unknown OS"): String {
    return "There's a new sign-in request on $operatingSystem for your Google Account $emailId."
}

fun PEDOMETERstepsTOcalories(NumberOFStepS: Int): Double {
    val CaloriesBURNEDforEachStep = 0.04
    val TotalCALORIESburned = NumberOFStepS * CaloriesBURNEDforEachStep
    return TotalCALORIESburned
}

// Function to compare the time spent today and yesterday
fun hasSpentMoreTimeToday(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
    return timeSpentToday > timeSpentYesterday
}

// Function to print weather details for a city
fun printWeatherDetails(city: String, lowTemp: Int, highTemp: Int, rainChance: Int) {
    println("City: $city")
    println("Low temperature: $lowTemp, High temperature: $highTemp")
    println("Chance of rain: $rainChance%")
}
