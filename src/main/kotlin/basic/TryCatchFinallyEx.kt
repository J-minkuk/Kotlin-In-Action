package basic

import java.io.BufferedReader
import java.io.StringReader
import java.lang.NumberFormatException

/**
 * 설명 : N/A
 *
 * @author Minkuk Jo / http://minkuk-jo.com
 * @since 2021. 02. 07.
 */
fun main() {
    val reader1 = BufferedReader(StringReader("1010"))
    println(readNumber1(reader1))
    val reader2 = BufferedReader(StringReader("abc"))
    println(readNumber1(reader2))

    val reader3 = BufferedReader(StringReader("not a number"))
    readNumber2(reader3)
}

fun readNumber1(reader: BufferedReader): Int? {
    return try {
        val line = reader.readLine()
        Integer.parseInt(line)
    } catch (e: NumberFormatException) {
        null
    } finally {
        reader.close()
    }
}

fun readNumber2(reader: BufferedReader) {
    val number =
        try {
            Integer.parseInt(reader.readLine())
        } catch (e: NumberFormatException) {
            return
//            null
        }
    println(number)
}
