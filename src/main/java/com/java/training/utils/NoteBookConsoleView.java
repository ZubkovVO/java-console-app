package com.java.training.utils;

import com.java.training.entity.Note;
import com.java.training.entity.NoteBook;

public class NoteBookConsoleView {

    public static void print(Note... notes) {
        System.out.println("--Multiple random notes--");
        for (Note note : notes) {
            System.out.println(note.toString());
        }
    }

    public static void print(Note note) {
        System.out.println("--One random note--");
        System.out.println(note);
    }

    public static void print(NoteBook noteBook) {
        System.out.println("--One random notebook--");
        System.out.println(noteBook);
    }

    public static void print(NoteBook[] noteBooks) {
        System.out.println("--All notebooks--");
        for (NoteBook noteBook : noteBooks) {
            System.out.println(noteBook.toString());
        }
    }

}
