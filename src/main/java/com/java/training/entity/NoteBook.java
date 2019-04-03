package com.java.training.entity;

import com.java.training.utils.RandomNoteValues;

import java.time.LocalDateTime;
import java.util.Arrays;

public class NoteBook {

    private Note[] notes;

    public NoteBook() {
        notes = new Note[5];
        for (int i = 0; i < notes.length; i++) {
            Note note = new Note(new RandomNoteValues().getRandomText(), new RandomNoteValues().getRandomTime());
            notes[i] = note;
        }
    }

    public Note[] getNotes() {
        return notes;
    }

    public void setNotes(Note[] notes) {
        this.notes = notes;
    }

    public int countNotes() {
        return notes.length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NoteBook noteBook = (NoteBook) o;
        return Arrays.equals(notes, noteBook.notes);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(notes);
    }

    @Override
    public String toString() {
        return "NoteBook{" +
                "notes=" + Arrays.toString(notes) +
                '}';
    }
}


