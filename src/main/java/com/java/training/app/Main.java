package com.java.training.app;

import com.java.training.entity.Note;
import com.java.training.entity.NoteBook;

public class Main {
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );

        /*Note note = new Note();*/
       // note.displayInfo();
      /*  System.out.println(note.toString());
        System.out.println(note.hashCode());
        System.out.println(note.equals(note));*/

       /* note.noteText="Some text";
        note.localDate.of(2018, 02, 20);
        note.displayInfo();

        NoteBook noteBook = new NoteBook();
        System.out.println(noteBook.countNotes());*/

       NoteBook noteBook = new NoteBook();
       System.out.println(noteBook.toString());

    }
}
