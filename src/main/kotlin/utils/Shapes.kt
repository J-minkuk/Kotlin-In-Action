package utils

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
        get() = (this.height == this.width)
}

fun createRandomRectangle(): Rectangle {
    val random = Random()
    return Rectangle(random.nextInt(5), random.nextInt(5))
}

class Circle(
    private val radius: Int
) {
    val area: Double
        get() = this.radius * this.radius * 3.14
}

fun createRandomCircle(): Circle {
    val random = Random()
    return Circle(random.nextInt(5) + 1)
}