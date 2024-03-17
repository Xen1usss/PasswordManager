package xen.passwordmanager.di

import android.util.Log
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module

val networkModule = module {
    single<Interceptor> {
        HttpLoggingInterceptor(HttpLoggingInterceptor.Logger { Log.d("OKHTTP", it) }).setLevel(
            HttpLoggingInterceptor.Level.BODY
        )
    }
    single {
        OkHttpClient.Builder().addInterceptor(get<Interceptor>()).build()
    }

}