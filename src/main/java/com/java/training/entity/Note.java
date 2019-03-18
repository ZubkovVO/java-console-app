package com.java.training.entity;

import java.time.LocalDate;

public class Note {
    public String getNoteText() {return noteText;}
    public LocalDate getNoteDate() {return noteDate;}

    String noteText;
    LocalDate noteDate = LocalDate.now();
    void displayInfo(){
        System.out.println(noteText +" "+ noteDate);
    }

    @Override
    public boolean equals(Object obj){
        //Проверяем рефлексивность: объект должен быть равен себе самому
        if (obj == this){
           return true;
        }
        /*Проверьте объект на null, а также проверьте, чтобы объекты были
        одного типа. Не делайте проверку с помощью instanceof так как такая
        проверка будет возвращать true для подклассов и будет работать правильно
        только в случае если ваш класс объявлен как immutable. Вместо этого можно
        использовать getClass();
         */
        if (obj == null || obj.getClass() != this.getClass()){
            return false;
        }
        //Транзитивность
        Note note = (Note) obj;
        return (noteText == note.noteText || (noteText != null && noteText.equals(note.getNoteText()))) &&
               (noteDate == note.noteDate || (noteDate != null && noteDate.equals(note.getNoteDate())));
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + ((noteText == null) ? 0 : noteText.hashCode());
        result = prime * result + ((noteDate == null) ? 0 : noteDate.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Текст заметки: " + noteText +"\n"+ "Дата заметки: " + noteDate;
    }

}
