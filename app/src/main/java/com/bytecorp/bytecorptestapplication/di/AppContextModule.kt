package com.bytecorp.bytecorptestapplication.di


import android.content.Context
import com.bytecorp.bytecorptestapplication.app.ByteCorpTestApp
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton


@InstallIn(ApplicationComponent::class)
@Module
object AppContextModule {

    @Singleton
    @Provides
    fun getApplicationContext(): Context = ByteCorpTestApp.getAppContext().applicationContext

}