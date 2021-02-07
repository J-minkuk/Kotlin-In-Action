package basic

import java.util.*

/**
 * 설명 : N/A
 *
 * @author Minkuk Jo / http://minkuk-jo.com
 * @since 2021. 02. 07.
 */
fun main() {
    for (i in 1..30) {
        print(fizzBuzz(i))
    }
    println()

    // 1 ~ 100
    for (i in 1..30) {
        print("$i ")
    }
    println()

    // downTo: 역방향, step 증감량
    for (i in 30 downTo 1 step 2) {
        print("$i ")
    }
    println()

    // 0 ~ 99
    for (x in 0 until 30) {
        print("$x ")
    }
    println()
    println()

    // map iteration
    val binaryReps = TreeMap<Char, String>()
    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary  // binaryReps.put(c, binary)
    }
    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }
    println()

    // arraylist iteration
    val list = arrayListOf("10", "11", "1001")
    for ((index, element) in list.withIndex()) {
        println("$index: $element")
    }
    println()

    println(isLetter('q'))
    println(isNotDigit('x'))
    println()

    println(recognize('8'))
    println(recognize('a'))
    println(recognize('Z'))
    println(recognize('-'))
    println()

    println("Kotlin" in "Java".."Scala")
    println("Kotlin" in setOf("Java", "Scala"))
}

fun fizzBuzz(i: Int) =
    when {
        (i % 15 == 0) -> "FizzBuzz"
        (i % 3 == 0) -> "Fizz"
        (i % 5 == 0) -> "Buzz"
        else -> "$i \n"
    }

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
fun isNotDigit(c: Char) = c !in '0'..'9'

fun recognize(c: Char) =
    when (c) {
        in '0'..'9' -> "It's a digit!"
        in 'a'..'z', in 'A'..'Z' -> "It's a letter!"
        else -> "I don't know"
    }
