package com.java.training.utils;

import com.java.training.entity.Note;
import com.java.training.entity.NoteBook;

import java.time.LocalDate;
import java.util.Random;

public class NoteBookProvider {

    private static NoteBookProvider instance;
    private NoteBookProvider(){}
    public static NoteBookProvider getInstance(){
        if(instance == null){
            instance = new NoteBookProvider();
        }
        return instance;
    }
    private NoteBook[] noteBooks;

    {

    }


    public NoteBook getRandomNoteBook(){
        return noteBooks[new Random().nextInt(noteBooks.length)];
    }

    public Note getRandomNote(){
        Note[] notes = getRandomNoteBook().getNotes();
        return notes[new Random().nextInt(notes.length)];
    }

    public NoteBook[] getNoteBooks(){
        return noteBooks;
    }




}
//NoteBook noteBook = new NoteBook();
//noteBook.setNotes();