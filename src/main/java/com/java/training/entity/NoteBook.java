package com.java.training.entity;

import java.time.LocalDate;
import java.util.Arrays;

public class NoteBook {
  //  public void setNotes(Note[] notes) {this.notes = notes;}

    public Note[] getNotes() {
        return notes;
    }

    public Note[] notes;

    public Note[] notes(String[] args) {
        notes = new Note[5];
        for (int i=0; i<notes.length; i++){
            Note note = new Note();
            note.text ="Just text";
            note.date = LocalDate.now();
            notes[i] = note;
        }

        for (int k=0; k<notes.length; k++){
            System.out.println(notes[k].text + " " + notes[k].date);
        }
        return notes;
    }

   public int countNotes(){
       System.out.println(notes.length);
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


