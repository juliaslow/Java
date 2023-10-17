/*package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
       /* ArrayList<String> listNames = new ArrayList<>();

        listNames.add("A");
        listNames.add("A");
        listNames.add("B");
        listNames.add("C");
        listNames.add("D");
        listNames.add("E");

 //       for (String element : listNames) {   // TO SAMO NA DOLE ROBI
 //           System.out.println(element);
 //       }

        System.out.println("Imiona w liscie:" + listNames);
        //listNames.forEach(System.out::println);  //referencja do metody

        Names name = new Names(listNames);

        name.choose();
        System.out.println("Imiona w liscie:" + listNames);
        //listNames.forEach(System.out::println);

    }

/*
        FrequentNames frequentNames = new FrequentNames();
        frequentNames.insert("John");
        frequentNames.insert("Alice");
        frequentNames.insert("Bob");
        frequentNames.insert("Alice");


        String mostFrequentNames = frequentNames.choose();
        if(mostFrequentNames != null)
        {
            System.out.println("Najczęściej występujące imię: " + mostFrequentNames);
        }
        else
        {
            System.out.println("Brak imion na liście.");
        }


        Products products = new Products();


        //  for(String product: products)
        //     System.out.println(product);

        products.add("A");
        products.add("B");
        products.add("C");
        products.add("A");
        products.add("D");

        while(!products.isEmpty())
        {
            String chosenName = products.choose();
            if (chosenName != null)
            {
                System.out.println("Produkt został nazwany " + chosenName);
            }

        }
        System.out.println("Wszystkie imiona zostały użyte.");


    }
}


/*
Pewna firma chce odpowiednio zapisać swoich klientów. Każdego miesiąca będą oni losowo wybierani aby otrzymać mały upominek.
Trzeba wybrać strukturę danych odpowiednią dla losowania.

Napisz program, który będzie losował nazwiska klientów z listy, a następnie je usuwał.
Dokładniej, zaimplementuj klasę Names z obiektowym atrybutem names odpowiadającym wspomnianej liście i z obiektową metodą choose(),
która zwraca losowo wybrane nazwisko z listy names usuwając je jednocześnie.

Ta sama firma chce ponazywać produkty imionami swoich pracowników. Każde imię będzie użyte tylko raz. Trzeba przygotować listę imion.
*/