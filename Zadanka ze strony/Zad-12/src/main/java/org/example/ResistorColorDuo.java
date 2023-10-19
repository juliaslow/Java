package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ResistorColorDuo
{
    final List<String> codes = Arrays.asList("black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white");

    int value(String[] color)
    {
        return codes.indexOf(color[0]) *10 + codes.indexOf(color[1]);
    }

    public String colorCode(String[] colors)
    {
        return Arrays.stream(colors)
                .collect(Collectors.joining("-"));

    }
}
    /*tworzysz pomocny program, dzięki któremu nie będziesz musiał pamiętać
        wartości pasm. Program pobierze nazwy kolorów jako dane wejściowe i
        wyprowadzi liczbę dwucyfrową, nawet jeśli na wejściu będzie więcej niż dwa kolory!
        Z powyższego przykładu: brązowo-zielony powinien zwrócić 15
        brązowo-zielony-fioletowy również powinien zwrócić 15, ignorując trzeci kolor.*/
