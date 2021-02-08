package basic.classex

/**
 * 설명 : use interface properties && definition custom getter
 *
 * @author Minkuk Jo / http://minkuk-jo.com
 * @since 2021. 02. 09.
 */
class SubscribeUser(val email: String) : UserProperties {
    override val nickname: String
        get() = email.substringBefore("@")
}