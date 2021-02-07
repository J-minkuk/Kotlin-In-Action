package basic

/**
 * 설명 : N/A
 *
 * @author Minkuk Jo / http://minkuk-jo.com
 * @since 2021. 02. 07.
 */
interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun main(args: Array<String>) {
    println(eval1(Sum(Sum(Num(1), Num(2)), Num(4))))
    println(eval2(Sum(Sum(Num(1), Num(2)), Num(4))))
}

// is -> java's instanceof
fun eval1(e: Expr): Int {
    if (e is Num) return e.value
    if (e is Sum) return eval1(e.right) + eval1(e.left)
    throw IllegalArgumentException("Unknown Expression")
}

fun eval2(e: Expr): Int =
    when (e) {
        is Num -> {
            println("num: ${e.value}")
            e.value
        }
        is Sum -> {
            eval2(e.right) + eval2(e.left)
        }
        else -> throw IllegalArgumentException("Unknown Expression")
    }

