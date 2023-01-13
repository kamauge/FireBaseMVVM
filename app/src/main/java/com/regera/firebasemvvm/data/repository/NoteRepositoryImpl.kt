package com.regera.firebasemvvm.data.repository

import com.regera.firebasemvvm.data.model.Note

class NoteRepositoryImpl : NoteRepository {
        override fun getNotes(): List<Note> {

        return arrayListOf()
    }
}