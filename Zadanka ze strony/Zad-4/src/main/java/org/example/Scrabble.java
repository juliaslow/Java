package org.example;

import java.util.HashMap;
import java.util.Map;

public class Scrabble
{
    private final String word;
    private static final Map<Integer,Integer> score = new HashMap<>(26);//Map<Integer, Integer> odnoszą się do typu klucza (kod znaku) i typu wartości (wartość punktowa) używanych w mapie score.
    // kluczem jest kod znaku (numer Unicode znaku, który reprezentuje literę) - dlatego int a nie string
    public Scrabble(String word) {  // Zamieniamy słowo na wielkie litery i przypisujemy je do pola word.
        this.word = word.toUpperCase();
    }

    static// To jest blok static, który jest wykonywany przy ładowaniu klasy Scrabble.
    {
        // Tworzymy mapę `score`, w której kluczami są kody znaków (wartości int) reprezentujące litery,
        // a wartościami są punkty przyznawane za te litery w grze w Scrabble.
        "AEIOULNRST".chars().forEach(c-> score.put(c,1));// klucz (kod znaku) i wartość (punkt za literę).
        "DG".chars().forEach(c-> score.put(c,2));
        "BCMP".chars().forEach(c-> score.put(c,3));
        "FHVWY".chars().forEach(c-> score.put(c,4));
        "K".chars().forEach(c-> score.put(c,5));
        "JX".chars().forEach(c-> score.put(c,8));
        "QZ".chars().forEach(c-> score.put(c,10));

    }
    int getScore()
    {
        // Korzystamy z metody `chars()`, aby uzyskać strumień kodów znaków ze słowa.
        // Następnie używamy metody `reduce`, aby zsumować punkty za litery w słowie.
        return word.chars().reduce(0,(a,b)->a +score.get(b));
        //word.chars(): Wywołanie chars() na zmiennej word zwraca strumień kodów znaków (kody Unicode) reprezentujących litery w słowie.
        //Metoda reduce na strumieniu przyjmuje dwa argumenty. Pierwszy argument (0 w tym przypadku) to wartość początkowa (inicjalizacyjna) sumy, a drugi argument to funkcja redukująca.
        ///(a, b) -> a + score.get(b): To jest funkcja redukująca. Działa na dwóch argumentach a i b. a to dotychczasowa suma punktów, a b to kolejny kod znaku z strumienia.
        // score.get(b), aby uzyskać wartość punktową odpowiadającą literze, którą reprezentuje kod b. Następnie dodajemy tę wartość do dotychczasowej sumy a.
    }

}
