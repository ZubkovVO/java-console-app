package com.java.training.app;

import com.java.training.entity.NoteBook;
import com.java.training.utils.NoteBookConsoleView;
import com.java.training.utils.NoteBookProvider;

public class Main {

    private static NoteBookProvider provider = new NoteBookProvider().getInstance();

    public static void main( String[] args )
    {
        NoteBookConsoleView view = new NoteBookConsoleView();
        view.print(provider.getRandomNoteBook());
        view.print(provider.getRandomNote());
        view.print(provider.getAllNotebooks());
        view.print(provider.getRandomNote());
    }
}
