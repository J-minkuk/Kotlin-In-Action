package basic

import utils.createRandomCircle
import utils.createRandomRectangle

data class Person(val name: String, val age: Int? = null)

fun max(a: Int, b: Int): Int = if (a > b) a else b

fun main() {
    println("Hello World!")

    //  Elvis operator ?: -> age가 null인 경우 0을 return, 아니면 age return
    val persons = listOf(Person("민국"), Person("하디", 30))
    val oldest = persons.maxByOrNull { it.age ?: 0 }
    println("oldest : ${oldest}입니다.")
    println("max : ${max(10, 20)}")

    // 참조가 가리키는 내부 값은 변경 가능
    val languages = arrayListOf("Java")
    languages.add("Kotlin")
    println(languages)

    // property로 특성을 정의하자 && 함수 import
    println(createRandomRectangle().isSquare)
    println(createRandomCircle().area)

    // Collection 자바의 컬렉션과 똑같은 클래스이지만 더 많은 기능을 제공
    val set = hashSetOf(1, 10, 30)
    val list = arrayListOf(1, 10 ,30)
    val map = hashMapOf(1 to "one", 10 to "ten", 30 to "thirty")
    val strings = listOf("first", "second", "third")
    println(set.javaClass)  // javaClass는 java's getClass()
    println(list.javaClass)
    println(map.javaClass)
    println(strings.last())
    println(list.joinToString(", ", "(", ")"))
    println(list.joinToString(separator = ", ", prefix = "(", postfix = ")"))
    println()

    // 정규식
    println("12.345-6.A".split(".", "-"))
}
