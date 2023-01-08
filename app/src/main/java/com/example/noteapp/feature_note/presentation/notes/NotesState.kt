package com.example.noteapp.feature_note.presentation.notes

import com.example.noteapp.feature_note.domain.model.Note
import com.example.noteapp.feature_note.domain.util.NoteOrder
import com.example.noteapp.feature_note.domain.util.OrderType

data class NotesState(
    val notesList: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Color(orderType = OrderType.Ascending),
    val isOrderSectionVisible: Boolean = false
)
