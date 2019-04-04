package com.java.training.app;

import com.java.training.utils.NoteBookConsoleView;
import com.java.training.utils.NoteBookProvider;

public class Main {


    public static void main(String[] args) {
        NoteBookProvider provider = NoteBookProvider.getInstance();
        NoteBookConsoleView.print(provider.getRandomNote());
        NoteBookConsoleView.print(provider.getRandomNote(), provider.getRandomNote());
        NoteBookConsoleView.print(provider.getRandomNoteBook());
        NoteBookConsoleView.print(provider.getAllNotebooks());

    }
}
