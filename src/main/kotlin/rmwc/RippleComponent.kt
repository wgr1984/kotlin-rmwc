@file:JsModule("rmwc/Ripple")
package rmwc

import react.*

external interface RippleProps: RProps {

    /** Uses the primary palette. */
    var primary: Boolean?

    /** Uses the accent palette. */
    var accent: Boolean?

    /** Lets a ripple grow outside of its bounds, just like on Checkboxes. */
    var unbounded: Boolean?
}

@JsName("Ripple")
external class RippleComponent: Component<RippleProps, RState> {
    override fun render(): ReactElement
}
