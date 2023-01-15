package com.regera.firebasemvvm.notes

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.regera.firebasemvvm.R
import com.regera.firebasemvvm.databinding.FragmentNoteListingBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class NoteListingFragment : Fragment() {

    private lateinit var binding: FragmentNoteListingBinding
    private val TAG  = "NoteListingFragment"
    private val noteViewModel : NoteViewModel by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentNoteListingBinding.inflate(inflater)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        noteViewModel.getNotes()
        noteViewModel.note.observe(viewLifecycleOwner) {
            it.forEach {
                Log.d(TAG,it.toString())
            }
        }
    }

}