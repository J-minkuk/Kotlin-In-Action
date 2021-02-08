package basic.classex

/**
 * 설명 : N/A
 *
 * @author Minkuk Jo / http://minkuk-jo.com
 * @since 2021. 02. 09.
 */
class User(
    val nickname: String,
    val isSubscribed: Boolean = true
) {
    var address: String = "unspecified"
        set(value) {
            println("""
                Address was changed for $nickname:
                "$field" -> "$value".""".trimIndent())
            field = value
        }
}