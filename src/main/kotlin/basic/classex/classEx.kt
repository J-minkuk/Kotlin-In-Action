package basic.classex

import java.awt.Window
import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent
import java.io.File

/**
 * 설명 : N/A
 *
 * @author Minkuk Jo / http://minkuk-jo.com
 * @since 2021. 02. 07.
 */
fun main() {
    val minkuk = User("minkuk")
    println(minkuk.isSubscribed)

    val hardy = User("hardy", false)
    println(hardy.isSubscribed)

    val jo = User("jo", isSubscribed = false)
    println(jo.isSubscribed)

    println(PrivateUser("test@kotlin.org").nickname)
    println(SubscribeUser("test@kotlin.org").nickname)

    val user = User("Alice")
    user.address = "ELELELELEL"
    println(user.address)

    val lengthCounter = LengthCounter()
    lengthCounter.addWord("Hardy")
    println(lengthCounter.counter)

    val client1 = Client("Hardy", 2021)
    val client2 = Client("Hardy", 2021)
    println(client1)
    println(client1 == client2)

    val customer = Customer("Jo", 30)
    println(customer)
    println(customer.copy(age = 29))

    val countingSet = CountingSet<Int>()
    countingSet.addAll(listOf(1, 1, 3))
    println("${countingSet.objectsAdded}, ${countingSet.size}")

    Payroll.calculateSalary()

    // comparator
    println(CaseInsensitiveFileComparator.compare(File("/User"), File("/user")))
    val files = listOf(File("/Z"), File("/a"))
    println(files.sortedWith(CaseInsensitiveFileComparator))
    val persons = listOf(Person("Hardy"), Person("Jo"))
    println(persons.sortedWith(Person.NameComparator))

    // secondary constructor
    val normalUser1 = NormalUser("test@test.com")
    println(normalUser1.nickname)
    val normalUser2 = NormalUser(1010)
    println(normalUser2.nickname)

    // companion object
    val subscribeAdminUser = AdminUser.newSubscribingAdminUser("test@gmail.com")
    println(subscribeAdminUser.nickname)

    Person.printJSON("{name: 'Dmitry'}")
}

// anonymous object
fun countClicks(window: Window) {
    var clickCount = 0
    window.addMouseListener(object : MouseAdapter() {
        override fun mouseClicked(e: MouseEvent) {
            clickCount++
        }
    })
}
