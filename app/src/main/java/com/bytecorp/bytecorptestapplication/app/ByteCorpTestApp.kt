package com.bytecorp.bytecorptestapplication.app

import android.app.Application
import android.content.Context
import androidx.multidex.MultiDex
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class ByteCorpTestApp :Application(){
    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }

    override fun onCreate() {
        super.onCreate()
        ctx = this
    }

    companion object {
        val TAG: String = ByteCorpTestApp::class.java.simpleName

        lateinit var ctx: ByteCorpTestApp

        fun getAppContext(): ByteCorpTestApp {
            return ctx
        }
    }
}