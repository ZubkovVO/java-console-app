package com.java.training.app;

import com.java.training.utils.NoteBookConsoleView;
import com.java.training.utils.NoteBookProvider;

public class Main {

    private static NoteBookProvider provider = new NoteBookProvider().getInstance();

    public static void main( String[] args )
    {
        NoteBookConsoleView view = new NoteBookConsoleView();
        System.out.println("--One note--");
        view.print(provider.getRandomNote());
        System.out.println("--Random notes--");
        view.print(provider.getRandomNote(),provider.getRandomNote());
        System.out.println("--Random notebook--");
        view.print(provider.getRandomNoteBook());
        System.out.println("--All notebooks with notes--");
        view.print(provider.getAllNotebooks());

    }
}
