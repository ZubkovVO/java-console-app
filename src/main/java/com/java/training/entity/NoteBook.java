package com.java.training.entity;

import java.util.Arrays;

public class NoteBook {
    public void setNotes(Note[] notes) {this.notes = notes;}

    Note[] notes = new Note[5];
    for (int i = 0; i < 5; i++)
        notes.[i] = i;

    public Note[] getNotes() {return notes;}

   int countNotes (){
       return notes.length;
   }

   @Override
   public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        NoteBook noteBook = (NoteBook) obj;
        return (notes == noteBook.notes || (notes != null && notes.equals(noteBook.getNotes())));
    }

   @Override
    public String toString() {
        return Arrays.toString(notes);
    }

   @Override
    public int hashCode(){
       return Arrays.hashCode(notes);
   }

}


