package com.java.training.entity;

import java.time.LocalDate;

public class Note {
    public String getText() {return text;}
    public LocalDate getDate() {return date;}

    String text;
    LocalDate date;

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
        return (text == note.text || (text != null && text.equals(note.getText()))) &&
               (date == note.date || (date != null && date.equals(note.getDate())));
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + ((text == null) ? 0 : text.hashCode());
        result = prime * result + ((date == null) ? 0 : date.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Текст заметки: " + text +"\n"+ "Дата заметки: " + date;
    }

}
