package com.java.training.utils;

import com.java.training.entity.Note;
import com.java.training.entity.NoteBook;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;

public class NoteBookProvider {

    {
        noteBooks = new NoteBook[5];
    }

    private NoteBook[] noteBooks;
    private static NoteBookProvider instance;

    /*пришлось сделать public т.к class Main не видел провайдер при создании экземпляра
    не смотря на то, что я вызывал метод getInstance*/
    public NoteBookProvider() {
    }

    public static NoteBookProvider getInstance() {
        if (instance == null) {
            instance = new NoteBookProvider();
            for (int i = 0; i < instance.noteBooks.length; i++) {
                NoteBook noteBook = new NoteBook();
                instance.noteBooks[i] = noteBook;
                System.out.println(instance.noteBooks);
            }
        }
        return instance;
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
