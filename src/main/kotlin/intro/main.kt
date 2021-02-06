package intro

data class Person(val name: String, val age: Int? = null)

fun main(args: Array<String>) {
    println("Hello World!")

    val persons = listOf(Person("민국"), Person("하디", 30))

    // Elvis operator ?: -> age가 null인 경우 0을 return, 아니면 age return
    val oldest = persons.maxByOrNull { it.age ?: 0 }

    println("oldest : $oldest")
}