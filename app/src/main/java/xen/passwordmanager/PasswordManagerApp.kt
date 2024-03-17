package xen.passwordmanager

import android.app.Application
import org.koin.core.context.startKoin
import xen.passwordmanager.di.domainModule
import xen.passwordmanager.di.networkModule
import xen.passwordmanager.di.viewModelModule

class ProductListApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(viewModelModule, networkModule, domainModule)
        }
    }
}