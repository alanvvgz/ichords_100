package com.ichords.app.appcomponents.di

import android.app.Application
import com.ichords.app.appcomponents.utility.PreferenceHelper
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.loadKoinModules
import org.koin.core.context.startKoin
import org.koin.core.module.Module
import org.koin.dsl.module


class MyApp : Application() {

    public override fun onCreate(): Unit {
        super.onCreate()
        instance = this
        startKoin {
            androidLogger()
            androidContext(this@MyApp)
            loadKoinModules(getKoinModules())
        }
    }


    private fun preferenceModule(): Module {
        val prefsModule = module {
            single {
                PreferenceHelper()
            }
        }
        return prefsModule
    }


    private fun getKoinModules(): MutableList<Module> {
        val koinModules = mutableListOf<Module>()
        koinModules.add(preferenceModule()) //register preference module
        return koinModules
    }

    public companion object {

        // the application instance
        private lateinit var instance: MyApp


        public fun getInstance(): MyApp = instance
    }
}