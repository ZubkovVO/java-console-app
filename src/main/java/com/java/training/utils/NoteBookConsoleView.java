package com.java.training.utils;

import com.java.training.entity.Note;
import com.java.training.entity.NoteBook;

public class NoteBookConsoleView {

    public static void print(Note... notes){
        for (Note note:notes) {
            System.out.println(note.toString());
        }
    }

    public void print(Note note){
        System.out.println(note);
    }

    public void print(NoteBook noteBook){
        System.out.println(noteBook);
    }

    public void print(NoteBook[] noteBooks){
        System.out.println(noteBooks);
    }

}
