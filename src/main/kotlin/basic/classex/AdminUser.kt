package basic.classex

/**
 * 설명 : companion object
 *
 * @author Minkuk Jo / http://minkuk-jo.com
 * @since 2021. 02. 09.
 */
class AdminUser private constructor(val nickname: String) {
    companion object {
        fun newSubscribingAdminUser(email: String) = AdminUser(email.substringBefore("@"))
    }
}