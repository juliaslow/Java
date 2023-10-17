package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Zadnaie 1.");
        ArrayList<String> listNames = new ArrayList<>();

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

        Names name = new Names(listNames);
        while(!name.isEmpty())
        {
            name.choose();
            System.out.println("Imiona w liscie:" + listNames);

        }


        System.out.println("\n");

        System.out.println("Zadnaie 2.");
        FrequentNames frequentNames = new FrequentNames(); // wywolanie konstruktora
        frequentNames.insert("John");
        frequentNames.insert("Alice");
        frequentNames.insert("Bob");
        frequentNames.insert("Alice");

        while (!frequentNames.isEmpty())
        {
            String mostFrequentName = frequentNames.choose();
            System.out.println("Najczęściej występujące imię: " + mostFrequentName);
        }
        System.out.println("Wszystkie imiona zostały użyte.");
        System.out.println("\n");




        System.out.println("Zadnaie 3.");
        Products products = new Products();  // wywolanie konstruktora
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
        System.out.println("\n");

        System.out.println("Zadnaie 4.");
        LinkedList<Match> tictet = new LinkedList<>();

        tictet.add(new Match("J", "S"));
        tictet.add(new Match("K", "A"));
        tictet.add(new Match("B", "T"));
        tictet.add(new Match("V", "R"));

        LinkedList<Match> tictetCopy = new LinkedList<>(tictet);
        System.out.println("Klienci w kolejce: ");
        while (!tictetCopy.isEmpty())
        {
            Match person = tictetCopy.poll();
            System.out.println("Imie: " + person.getName() + ", Nazwisko: " + person.getLastName());
        }


        while(!tictet.isEmpty()) {
            tictet.removeFirst(); // Poprawne usunięcie pierwszego elementu
            System.out.println("\n");
            System.out.println("Obecna kolejka:");
            if(tictet.isEmpty())
            {
                System.out.println("Kolejka jest pusta");
            }
            for (Match match : tictet) {
                System.out.println("Imie: " + match.getName() + ", Nazwisko: " + match.getLastName());
            }
        }

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