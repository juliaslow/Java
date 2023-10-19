package org.example;


import java.util.Arrays;

import static java.util.Arrays.stream;

public class ResistorColor
{
    private enum Colors
    {
        BLACK,
        BROWN,
        RED,
        ORANGE,
        YELLOW,
        GREEN,
        BLUE,
        VIOLET,
        GREY,
        WHITE;
    }

    public int checkValue(String color)
    {
        return Colors.valueOf(color).ordinal();
    }//ordinal() zwraca pozycję (indeks) tego elementu w wyliczeniu.

    public String[] list()
    {
        return stream(Colors.values())
                .map(Enum::name)
                .toArray(String[]:: new);
    }

int colorCode(String color) {
        return Arrays.asList(colors()).indexOf(color);
    }
    String[] colors() {
        return new String[]{"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
    }

}
       /*
       Colors.values() - Ta część kodu pobiera wszystkie dostępne wartości z wyliczenia Colors jako tablicę wartości Colors[].
       .map(Enum::name) - Następnie używamy strumienia (Stream) do przekształcenia tych wartości wyliczenia na ich nazwy, używając metody name(). W rezultacie mamy strumień nazw kolorów.
        .toArray(String[]::new) - Na koniec przekształcamy strumień nazw kolorów w tablicę łańcuchów. Używamy metody toArray, a String[]::new tworzy nową pustą tablicę łańcuchów, do której dodajemy wyniki z naszego strumienia.*/


   /* Celem tego ćwiczenia jest stworzenie sposobu:
        aby sprawdzić wartość liczbową związaną z określonym pasmem koloru
        aby wyświetlić listę różnych kolorów pasm*/
