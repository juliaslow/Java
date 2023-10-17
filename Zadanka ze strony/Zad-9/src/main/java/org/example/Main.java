package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj współrzędną x:");
        double x = scanner.nextDouble();

        System.out.println("Podaj współrzędną y:");
        double y = scanner.nextDouble();

        Darts darts = new Darts();
        int score = darts.score(x, y);

        System.out.println("Wynik strzału: " + score);
    }
}