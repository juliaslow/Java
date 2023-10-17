package org.example;



import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Products
{
    private Set<String> usedNames;
    String chosenName = null;

    public Products()
    {
        this.usedNames =  new HashSet<>();
    }

  /*  public String choose()
    {
        if(usedNames.isEmpty())
        {
            return "Lista jest pusta";
        }


        String chosenName = null;
                // sprawdzanie czy imie było juz uzyte


        chosenName = String.valueOf(usedNames.iterator()); // Wybieramy pierwsze dostępne imię, iterator- zwraca obiekt iteratora, który można użyć do iteracji przez elementy w zbiorze, next-wywołana na obiekcie iteratora zwraca kolejny element w zbiorze, zwracając go jako wynik. W przypadku wywołania next() po raz pierwszy, zwraca pierwszy element w zbiorze.
        usedNames.remove(chosenName); // dodawanie juz uzytego imienia


       return chosenName;
    }
*/
  public String choose()
  {

      if (usedNames.isEmpty())
      {
          return "Lista jest pusta";
      }

      Iterator<String> iterator = usedNames.iterator();
      if (iterator.hasNext())
      {
          chosenName = iterator.next(); // Pobieramy pierwsze dostępne imię z iteratora
          iterator.remove(); // Usuwamy wybrane imię z iteratora (i użytych)

      }
      else
      {
          return null;
      }

      return chosenName;
  }

    public void add(String a)
    {
        usedNames.add(a);
    }



    public boolean isEmpty()
    {
        return usedNames.isEmpty();
    }
}
