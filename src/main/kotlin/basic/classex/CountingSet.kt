package basic.classex

/**
 * 설명 : by 위임
 *
 * @author Minkuk Jo / http://minkuk-jo.com
 * @since 2021. 02. 09.
 */
class CountingSet<T>(
    val innerSet: MutableCollection<T> = HashSet<T>()
) : MutableCollection<T> by innerSet {  // MutableCollection의 구현을 innerSet에게 위임한다

    var objectsAdded = 0

    override fun add(element: T): Boolean {
        objectsAdded++
        return innerSet.add(element)
    }

    override fun addAll(elements: Collection<T>): Boolean {
        objectsAdded += elements.size
        return innerSet.addAll(elements)
    }

}