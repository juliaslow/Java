package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Raindrops
{
   /* public String rainSignals(int number)
    {

       String wynik = "";
        if((number % 3) ==0 )
            wynik+= "Pling";
        if((number % 5) ==0)
            wynik+= "Plang";
        if((number % 7) ==0)
            wynik+= "Plong";
        if (wynik.isEmpty())
        {
            System.out.println("Wynik: "+ number);
        }
        return wynik;
    }*/
    private static final HashMap<Integer,String> map = new HashMap<>();
    static { //To jest blok inicjalizacyjny klasy, który jest uruchamiany podczas inicjalizacji klasy
        map.put(3,"Pling");
        map.put(5,"Plang");
        map.put(7,"Plong");
    }

    public String rain(int number)
    {
        return map
                .keySet() //pobieramy zestaw kluczy z mapy
                .stream() //Konwertuje zbiór kluczy na strumień.
                .filter(key -> number % key == 0) //Filtruje elementy strumienia.
                .map(map::get)//mapujemy każdy klucz na odpowiadający mu dźwięk deszczu //(key-> map.get(key))
                .reduce((s1,s2) -> s1+s2) // redukujemy strumień dźwięków, łączając je w pojedynczy łańcuch znaków
                .orElse(Integer.toString(number));//: Jeśli strumień jest pusty
    }
}
