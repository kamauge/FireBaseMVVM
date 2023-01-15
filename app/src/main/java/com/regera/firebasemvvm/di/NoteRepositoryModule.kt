package com.regera.firebasemvvm.di

import com.google.firebase.firestore.FirebaseFirestore
import com.regera.firebasemvvm.data.repository.NoteRepository
import com.regera.firebasemvvm.data.repository.NoteRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NoteRepositoryModule {

    @Singleton
    @Provides
    fun provideNoteRepository(database:FirebaseFirestore) : NoteRepository {

        return NoteRepositoryImpl(database)
    }
}