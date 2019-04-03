package com.java.training.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class Note {
    private String text;
    private LocalDateTime date;


    public Note(String text, LocalDateTime date) {
        this.text = text;
        this.date = date;
    }

    public String getText() {return text;}
    public LocalDateTime getDate() {return date;}
    public void setText(String text) {this.text = text;}
    public void setDate(LocalDateTime date) {this.date = date;}


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Note note = (Note) o;
        return Objects.equals(text, note.text) &&
                Objects.equals(date, note.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, date);
    }

    @Override
    public String toString() {
        return "Note{" +
                "text='" + text + '\'' +
                ", date=" + date +
                '}';
    }
}
