package visapps.mystankin.app.mj.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import visapps.mystankin.app.mj.home.ModulesFragment

@Module
abstract class MJFragmentsModule {

    @ContributesAndroidInjector
    abstract fun contributeModulesFragment(): ModulesFragment
}