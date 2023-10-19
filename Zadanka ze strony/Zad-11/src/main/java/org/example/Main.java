package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ResistorColor resistorColor = new ResistorColor();

        // Sprawdzanie wartości koloru
        String colorToCheck = "RED";
        int value = resistorColor.checkValue(colorToCheck);
        System.out.println("Wartość koloru " + colorToCheck + " to " + value);

        // Wylistowanie dostępnych kolorów
        String[] availableColors = resistorColor.list();
        System.out.println("Dostępne kolory: " + Arrays.toString(availableColors));


       //lub
        String colorToFind = "red";
        int colorCode = resistorColor.colorCode(colorToFind);
        if (colorCode != -1) {
            System.out.println("\nKod koloru " + colorToFind + " to " + colorCode);
        } else {
            System.out.println("\nKolor " + colorToFind + " nie został znaleziony.");
        }

        // Przykładowe użycie funkcji colors
        System.out.println("Dostępne kolory to:");
        String[] available = resistorColor.colors();
        for (String color : available) {
            System.out.println(color);
        }
    }
}