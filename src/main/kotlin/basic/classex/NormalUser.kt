package basic.classex

/**
 * 설명 : secondary constructor
 *
 * @author Minkuk Jo / http://minkuk-jo.com
 * @since 2021. 02. 09.
 */
class NormalUser {
    val nickname: String

    constructor(email: String) {
        nickname = email.substringBefore("@")
    }

    constructor(accountId: Int) {
        nickname = accountId.toString()
    }
}