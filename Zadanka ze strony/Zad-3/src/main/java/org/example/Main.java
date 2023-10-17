package org.example;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime dataUrodzenia = LocalDateTime.of(2002, 4, 18, 10, 45, 0);
        GigaSecond gigasekunda = new GigaSecond(dataUrodzenia);
        LocalDateTime jednaGigasekundaPóźniej = gigasekunda.getData();
        System.out.println("Jedna gigasekunda później: " + jednaGigasekundaPóźniej);
    }
}