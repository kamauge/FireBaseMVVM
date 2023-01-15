package com.regera.firebasemvvm.notes

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.regera.firebasemvvm.data.model.Note
import com.regera.firebasemvvm.data.repository.NoteRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class NoteViewModel @Inject constructor(
    private val noteRepository :  NoteRepository) : ViewModel() {

    private val _notes = MutableLiveData<List<Note>>()
    val note : LiveData<List<Note>> get() = _notes
    fun getNotes() {

        _notes.value = noteRepository.getNotes()

    }
}