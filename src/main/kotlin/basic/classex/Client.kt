package basic.classex

/**
 * 설명 : N/A
 *
 * @author Minkuk Jo / http://minkuk-jo.com
 * @since 2021. 02. 09.
 */
class Client(val name: String, val postalCode: Int) {

    override fun toString(): String {
        return "Client(name='$name', postalCode=$postalCode)"
    }

}
