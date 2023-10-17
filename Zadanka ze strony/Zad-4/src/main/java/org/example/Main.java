package org.example;

public class Main {
    public static void main(String[] args) {
        String word = "example"; // Twój wyraz
        String word1 = "JuliaSlowinska"; // Twój wyraz

        Scrabble scrabble = new Scrabble(word);
        Scrabble scrabble1 = new Scrabble(word1);
        int score = scrabble.getScore();
        int score1 = scrabble1.getScore();

        System.out.println("Wartość punktowa słowa '" + word + "' w Scrabble: " + score);
        System.out.println("Wartość punktowa słowa '" + word1 + "' w Scrabble: " + score1);
    }
}
