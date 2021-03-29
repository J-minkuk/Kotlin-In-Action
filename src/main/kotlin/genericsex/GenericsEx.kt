package genericsex

/**
 * 설명 : N/A
 *
 * @author Minkuk Jo / http://minkuk-jo.com
 * @since 2021. 03. 29.
 */
inline fun <reified T> getMessage(number: Int): T {
    return when (T::class) {
        String::class -> "This is $number" as T
        Int::class -> number as T
        else -> "Nothing" as T
    }
}

fun main() {
    val result1 = getMessage<Int>(10)
    println(result1)
    val result2 = getMessage<String>(10)
    println(result2)
}