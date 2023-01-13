package com.regera.firebasemvvm.data.repository

import com.regera.firebasemvvm.data.model.Note

interface NoteRepository {

    fun getNotes() : List<Note>
}