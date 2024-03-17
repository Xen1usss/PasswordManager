package xen.passwordmanager.di

import org.koin.dsl.module
import xen.passwordmanager.ui.createeditpassword.CreateEditPasswordViewModel

val viewModelModule = module {
    single {
        CreateEditPasswordViewModel()
    }
}