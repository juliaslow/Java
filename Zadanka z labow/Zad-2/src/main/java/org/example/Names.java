package org.example;

import java.util.List;
import java.util.Random;

public class Names
{
    List<String> names;
    Random random;

    public Names(List<String> names)
    {
        this.names = names;
        this.random = new Random();
    }

    public String choose()
    {
        if (names.isEmpty())
        {
            throw new IllegalArgumentException("Lista jest pusta");
        }
        int randomIndex;
        String chosenName;

        randomIndex = random.nextInt(names.size()); //używana do generowania losowych liczb całkowitych. Można ją wywołać na obiekcie klasy Random, aby uzyskać losową liczbę całkowitą w określonym zakresie.
        chosenName = names.get(randomIndex);
        System.out.println("Wybrano imie do wygrania: " +  chosenName + "\n");

        names.remove(randomIndex);
        return chosenName;
    }

    public boolean isEmpty()
    {
        return names.isEmpty();
    }

}
