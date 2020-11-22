import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class KoinSDK private constructor(builder: Builder) {

    init {
        startKoin {
            androidContext(builder.application)
        }
    }

    @androidx.annotation.Keep
    class Builder {
        lateinit var application: Application
        fun withApplication(application: Application) {
            this.application = application
        }

        fun build(): KoinSDK {
            return KoinSDK(this)
        }
    }
}