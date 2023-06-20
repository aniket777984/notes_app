package com.aniket777984.notesapp.adapters

import androidx.recyclerview.widget.DiffUtil
import com.aniket777984.notesapp.model.Note

class DiffUtilCallback :DiffUtil.ItemCallback<Note>(){

    override fun areItemsTheSame(oldItem: Note, newItem: Note): Boolean {
        return oldItem.id==newItem.id
    }

    override fun areContentsTheSame(oldItem: Note, newItem: Note): Boolean {
        return oldItem.id==newItem.id
    }



}