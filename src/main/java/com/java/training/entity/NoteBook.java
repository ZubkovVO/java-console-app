package com.java.training.entity;

import java.time.LocalDate;
import java.util.Arrays;

public class NoteBook {
  //  public void setNotes(Note[] notes) {this.notes = notes;}

    public Note[] getNotes() {
        return notes;
    }

    public Note[] notes;

    public NoteBook() {
        notes = new Note[5];
        for (int i=0; i<notes.length; i++){
            Note note = new Note();
            note.setText("Just text");
            note.setDate(LocalDate.now());
            notes[i] = note;
        }
    }

   public int countNotes(){
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


