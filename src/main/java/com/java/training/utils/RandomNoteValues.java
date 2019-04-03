package com.java.training.utils;

import java.time.LocalDateTime;
import java.util.Random;

public class RandomNoteValues {

    private String[] randomText;
    private LocalDateTime[] randomTime;

    {
        randomText = new String[5];
        randomText[0]="В моём суде нет такой вещи, как прошение о невиновности. Просящий" +
                "о невиновности виновен в отнятии у меня ценного времени. Виновен. " +
                "— Высший лорд-инквизитор Карамазов";
        randomText[1]="Вещи редко таковы, какими кажутся. Судя по моему личному опыту, "+
                "они обычно гораздо хуже. — Инквизитор Титус Дрейк";
        randomText[2]="Единственным благом является знание, а единственным злом – невежество";
        randomText[3]="«Размышления порождают ересь. Ересь порождает возмездие.»" +
                "  — Эпиграф к книгам про Грегора Эйзенхорна";
        randomText[4]="Безделье суть ересь.";
        randomTime = new LocalDateTime[]{LocalDateTime.now(),LocalDateTime.MIN, LocalDateTime.MAX};

    }

    public RandomNoteValues(){

    }


    public String getRandomText() {
        return randomText[new Random().nextInt(randomText.length)];
    }

    public LocalDateTime getRandomTime() {
        return randomTime[new Random().nextInt(randomTime.length)];
    }


}
