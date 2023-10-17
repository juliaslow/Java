package org.example;

import java.util.Optional;

public class Twofer {
    static String twofer(String name) {
        return String.format("One for %s, one for me.", //Służy do sformatowania napisu z użyciem wartości %s. Wartość %s jest zastępowana wartością z obiektu Optional
                Optional.ofNullable(name).orElse("you")); //Optional.ofNullable(name) - Tworzy obiekt typu Optional z wartością name. Jeśli name jest null, to stworzony jest obiekt Optional z wartością pustą.
    } // przecinek do %s

    public void setName(String name) {

        if (name == "") {
            System.out.println("One for you, one for me.");
        } else {
            System.out.println("One for " + name + ", one for me.");
        }
    }

}
