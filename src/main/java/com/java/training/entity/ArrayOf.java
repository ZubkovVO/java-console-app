package com.java.training.entity;

import java.time.LocalDate;

public class ArrayOf {

    public static void main(String[] args) {
        Student[] studentArray = new Student[7];
        for (int i=0; i<studentArray.length; i++){
            studentArray[i]=new Student();
            studentArray[i].marks=12;
            studentArray[i].date=LocalDate.now();
        }

        for (int k=0; k<studentArray.length; k++){
            System.out.println(studentArray[k].marks + " " + studentArray[k].date);
        }
    }

    public static void modify(Student s) {
        s.marks = 100;
    }


}
