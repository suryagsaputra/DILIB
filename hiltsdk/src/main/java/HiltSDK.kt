class HiltSDK private constructor(builder: Builder) {

    @androidx.annotation.Keep
    class Builder {
        fun build(): HiltSDK {
            return HiltSDK(this)
        }
    }
}