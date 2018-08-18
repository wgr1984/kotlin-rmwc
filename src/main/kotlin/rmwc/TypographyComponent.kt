@file:JsModule("rmwc/Typography")
package rmwc

import react.Component
import react.RState
import react.ReactElement

external interface TypographyProps: SimpleTagProps {

    /** The typography style.*/
    var use: String

    /** Sets adjust margin modifier for Typography. */
    var adjustMargin: Boolean?
}

@JsName("Typography")
external class TypographyComponent: Component<TypographyProps, RState> {
    override fun render(): ReactElement
}
