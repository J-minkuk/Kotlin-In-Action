package basic.interfaceex

/**
 * 설명 : N/A
 *
 * @author Minkuk Jo / http://minkuk-jo.com
 * @since 2021. 02. 08.
 */
open class RichButton : Clickable { // open: 다른 클래스가 상속 가능

    fun disable() {}    // default final이기 때문에 override 불가능

    open fun animate() {}   // open: override 가능

    override fun click() {} // override한 메소드는 기본적으로 open

}