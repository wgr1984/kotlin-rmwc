package rmwc

import react.Component
import react.RState
import react.ReactElement

@JsName("CardPrimary")
external class CardPrimaryComponent: Component<SimpleTagProps, RState> {
    override fun render(): ReactElement
}

external interface CardTitleProps: SimpleTagProps {
    /** Make the title large. */
    var large: Boolean
}

@JsName("CardTitle")
external class CardTitleComponent: Component<CardTitleProps, RState> {
    override fun render(): ReactElement
}

@JsName("CardSubtitle")
external class CardSubtitleComponent: Component<SimpleTagProps, RState> {
    override fun render(): ReactElement
}

@JsName("CardSupportingText")
external class CardSupportingTextComponent: Component<SimpleTagProps, RState> {
    override fun render(): ReactElement
}

@JsName("CardActions")
external class CardActionsComponent: Component<SimpleTagProps, RState> {
    override fun render(): ReactElement
}

@JsName("CardMedia")
external class CardMediaComponent: Component<SimpleTagProps, RState> {
    override fun render(): ReactElement
}

@JsName("CardHorizontalBlock")
external class CardHorizontalBlockComponent: Component<SimpleTagProps, RState> {
    override fun render(): ReactElement
}

@JsName("CardAction")
external class CardActionComponent: Component<ButtonProps, RState> {
    override fun render(): ReactElement
}

external interface CardProps: SimpleTagProps {
    /** Use the cards dark theme. */
    var themeDark: Boolean
}

@JsName("Card")
external class CardComponent: Component<CardProps, RState> {
    override fun render(): ReactElement
}
