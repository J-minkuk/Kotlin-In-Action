package invokeex

/**
 * 설명 : N/A
 *
 * @author Minkuk Jo / http://minkuk-jo.com
 * @since 2021. 03. 29.
 */
object DoSomething {
    operator fun invoke(value: String): String {
        return value.toUpperCase()
    }

    operator fun plus(value: String): String {
        return this.toString() + value
    }

    override fun toString(): String {
        return "DoSomething"
    }
}

fun main() {
    println(DoSomething.invoke("hello"))
    println(DoSomething("hello"))
    println(DoSomething + " Hello")
}
