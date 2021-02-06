package util

import java.util.*

/**
 * 설명 : N/A
 *
 * @author Minkuk Jo / http://minkuk-jo.com
 * @since 2021. 02. 07.
 */
class Rectangle(
    private val height: Int,
    private val width: Int
) {
    val isSquare: Boolean
        get() = (height == width)
}

fun createRandomRectangle(): Rectangle {
    val random = Random()
    return Rectangle(random.nextInt(), random.nextInt())
}