package basic

import basic.Color.*

/**
 * 설명 : N/A
 *
 * @author Minkuk Jo / http://minkuk-jo.com
 * @since 2021. 02. 07.
 */
enum class Color(
    private val r: Int,
    private val g: Int,
    private val b: Int
) {
    RED(255, 0, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    YELLOW(255, 255, 0);

    fun rgb() = (r * 256 + g) * 256 + b
}

fun main() {
    println(BLUE.rgb())
    println(getMnemonic(BLUE))
    println(getMnemonic(YELLOW))
    println(mix(BLUE, YELLOW))
    println(mixOptimized(BLUE, YELLOW))
}

fun getMnemonic(color: Color) =
    when (color) {
        RED -> "APPLE"
        BLUE -> "FLO"
        GREEN, YELLOW -> "MELON"
    }

fun mix(c1: Color, c2: Color) =
    when (setOf(c1, c2)) {
        setOf(RED, YELLOW) -> YELLOW
        setOf(YELLOW, BLUE) -> GREEN
        else -> throw Exception("Dirty Color")
    }

fun mixOptimized(c1: Color, c2: Color) =
    when {
        (c1 == RED && c2 == YELLOW) || (c1 == YELLOW && c2 == RED) -> YELLOW
        (c1 == YELLOW && c2 == BLUE) || (c1 == BLUE && c2 == YELLOW) -> GREEN
        else -> throw Exception("Dirty Color")
    }
