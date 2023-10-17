package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {

        List<String> names = new ArrayList<>();

        names.add("J");
        names.add("A");
        names.add("K");
        names.add("");

        Twofer twofer = new Twofer();

        for(String name:names)
        {
           twofer.setName(name);
        }
        System.out.println();
        String message1 = Twofer.twofer("Alice");
        String message2 = Twofer.twofer(null);

        System.out.println(message1); // Wyświetli: "One for Alice, one for me."
        System.out.println(message2); // Wyświetli: "One for you, one for me."

        // System.out.println("Hello world!");
    }
}