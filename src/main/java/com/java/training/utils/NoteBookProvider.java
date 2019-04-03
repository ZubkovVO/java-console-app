package com.java.training.utils;

import com.java.training.entity.Note;
import com.java.training.entity.NoteBook;

import java.time.LocalDateTime;
import java.util.Random;

public class NoteBookProvider {

    public static NoteBookProvider getInstance() {
        if (instance == null) {
            instance = new NoteBookProvider();
        }
        return instance;
    }

    private NoteBook[] noteBooks;

    //Array initialize
    {
        noteBooks = new NoteBook[5];
        for (int i = 0; i < noteBooks.length; i++)
            noteBooks[i] = new NoteBook();
    }

    private static NoteBookProvider instance;

    public NoteBookProvider() {
    }

    public NoteBook getRandomNoteBook() {
        return noteBooks[new Random().nextInt(noteBooks.length)];
    }

    public Note getRandomNote() {
        Note[] notes = getRandomNoteBook().getNotes();
        return notes[new Random().nextInt(notes.length)];
    }

    public NoteBook[] getAllNotebooks(){
        return noteBooks;
    }
}
