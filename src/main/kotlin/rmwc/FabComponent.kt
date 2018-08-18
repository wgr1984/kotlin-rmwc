@file:JsModule("rmwc/Fab")
package rmwc

import react.Component
import react.RState
import react.ReactElement

external interface FabRootProps: SimpleTagProps, WithRippleProps {

    /** Make the Fab smaller. */
    var mini: Boolean?
}

external interface FabProps: FabRootProps

@JsName("Fab")
external class FabComponent: Component<FabProps, RState> {
    override fun render(): ReactElement
}
