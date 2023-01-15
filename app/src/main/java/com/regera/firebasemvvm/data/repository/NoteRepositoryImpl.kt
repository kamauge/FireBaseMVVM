package com.regera.firebasemvvm.data.repository

import com.google.firebase.firestore.FirebaseFirestore
import com.regera.firebasemvvm.data.model.Note
import java.util.Date

class NoteRepositoryImpl(val database:FirebaseFirestore) : NoteRepository {
        override fun getNotes(): List<Note> {

        return arrayListOf(
            Note(
            "1",
            "note 1",
            Date()),
            Note(
                "2",
                "note 2",
                Date()),
            Note(
                "3",
                "note 3",
                Date()),
            Note(
                "4",
                "note 4",
                Date()),


        )
    }
}