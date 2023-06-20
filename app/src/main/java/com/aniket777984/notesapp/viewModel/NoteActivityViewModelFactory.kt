package com.aniket777984.notesapp.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.aniket777984.notesapp.repository.NoteRepository

class NoteActivityViewModelFactory(private val repository: NoteRepository):ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return NoteActivityViewModel(repository) as T
    }
}