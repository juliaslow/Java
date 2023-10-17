package org.example;

import java.util.Scanner;

public class DoTrzechRazySztuka{

    //float pobrana = scanner.nextInt(); // pobieramy liczbe od uzytkownika

    public void funkcja()
    {
        Scanner scanner = new Scanner(System.in); // inicjalizacja skanera, który będzie pobierał wartości zmiennyc
       // float pobrana = scanner.nextInt();
        int tries = 0;

        while (tries< 3)
        {
            System.out.println("Podaj liczbe jako float: ");
            String pobrana = scanner.nextLine(); // pobieramy liczbe od uzytkownika /// czy nextLine()?
            try
            {
                float number = Float.parseFloat(pobrana);
                System.out.println("x = " + number);
                return;
            }
            catch(NumberFormatException exception)
            {
                tries++;
                System.out.println("Zly format. Sprobuj jeszcze raz. Zostalo " + (3- tries) + " prob.");

            }
        }
        System.out.println("Przekroczono limit prób. Koniec programu.");
    }
}
