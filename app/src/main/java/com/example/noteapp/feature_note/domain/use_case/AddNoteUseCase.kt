package com.example.noteapp.feature_note.domain.use_case

import com.example.noteapp.feature_note.domain.model.InvalidNoteException
import com.example.noteapp.feature_note.domain.model.Note
import com.example.noteapp.feature_note.domain.repository.NoteRepository

class AddNoteUseCase(
    private val repository: NoteRepository
) {
    @Throws(InvalidNoteException::class)
    suspend operator fun invoke(note: Note){
        if(note.title.isBlank()){
            throw InvalidNoteException("The title of the note can not be empty.")
        }
        if(note.content.isBlank()){
            throw InvalidNoteException("The content of the note can not be empty.")
        }
        repository.insertNote(note)
    }
}