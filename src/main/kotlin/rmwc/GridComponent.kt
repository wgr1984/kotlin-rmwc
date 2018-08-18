@file:JsModule("rmwc/Grid")
package rmwc

import react.Component
import react.RState
import react.ReactElement

@JsName("Grid")
external class GridComponent: Component<SimpleTagProps, RState> {
    override fun render(): ReactElement
}

external interface GridCellProps: SimpleTagProps {
    var span: Int?
    var phone: Int?
    var tablet: Int?
    var desktop: Int?
}

@JsName("GridCell")
external class GridCellComponent: Component<GridCellProps, RState> {
    override fun render(): ReactElement
}
