package com.regera.firebasemvvm.notes

import androidx.lifecycle.ViewModel
import com.regera.firebasemvvm.data.model.Note
import com.regera.firebasemvvm.data.repository.NoteRepository

class NoteViewModel(
    private val noteRepository :  NoteRepository) : ViewModel() {
    fun getNotes() : List<Note>{

      return  noteRepository.getNotes()
    }
}