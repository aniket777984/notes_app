package com.aniket777984.notesapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.aniket777984.notesapp.R
import com.aniket777984.notesapp.databinding.ActivityMainBinding
import com.aniket777984.notesapp.db.NoteDatabase
import com.aniket777984.notesapp.repository.NoteRepository
import com.aniket777984.notesapp.viewModel.NoteActivityViewModel
import com.aniket777984.notesapp.viewModel.NoteActivityViewModelFactory

class MainActivity : AppCompatActivity() {

    lateinit var noteActivityViewModel: NoteActivityViewModel
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        binding = ActivityMainBinding.inflate(layoutInflater)

        try {
            setContentView(binding.root)
            val noteRepository = NoteRepository(NoteDatabase(this))
            val noteActivityViewModelFactory=NoteActivityViewModelFactory(noteRepository)
            val noteActivityViewModel =
                ViewModelProvider(this,noteActivityViewModelFactory)[NoteActivityViewModel::class.java]
        }catch (e:Exception)
        {
            Log.d("TAG","Error")
        }

    }
}