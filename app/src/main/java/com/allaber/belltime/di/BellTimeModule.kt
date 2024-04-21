package com.allaber.belltime.di

import com.allaber.data.repository.ScheduleRepositoryImpl
import com.allaber.domain.repository.ScheduleRepository
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
interface BellTimeModule {

    @Binds
    @Singleton
    fun bindScheduleRepository(impl: ScheduleRepositoryImpl): ScheduleRepository
}
