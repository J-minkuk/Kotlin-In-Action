package basic.classex

/**
 * 설명 : private set
 *
 * @author Minkuk Jo / http://minkuk-jo.com
 * @since 2021. 02. 09.
 */
class LengthCounter {
    var counter: Int = 0
        private set

    fun addWord(word: String) {
        counter += word.length
    }
}