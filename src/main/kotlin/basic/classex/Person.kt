package basic.classex

/**
 * 설명 : singleton comparator
 *
 * @author Minkuk Jo / http://minkuk-jo.com
 * @since 2021. 02. 09.
 */
data class Person(val name: String) {
    object NameComparator : Comparator<Person> {
        override fun compare(o1: Person, o2: Person): Int = o1.name.compareTo(o2.name)
    }

    companion object : JSONFactory {
        override fun printJSON(jsonText: String) = println(jsonText)
    }
}