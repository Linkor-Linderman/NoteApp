package com.example.noteapp.feature_note.presentation.utill

sealed class Screen(val route: String){
    object NoteScreen: Screen("notes_screen")
    object AddEditScreen: Screen("add_edit_note_screen")
}
