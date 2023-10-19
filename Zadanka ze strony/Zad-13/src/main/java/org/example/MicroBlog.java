package org.example;

public class MicroBlog
{
    public String truncate(String input)
    {
        if (input.length() > 5)
        {
            input = input.substring(0, input.offsetByCodePoints(0,5));
        }
        return input;


       // return input.length() < 6 ? input : input.substring(0, input.offsetByCodePoints(0, 5));
    }
}
/*
        input.length() zwraca długość ciągu w jednostkach kodu Unicode (codeunits).
        substring() do skracania ciągu znaków
        offsetByCodePoints w Javie jest używana do obliczenia nowego indeksu znaku w ciągu znaków, na podstawie początkowego indeksu i liczby przesuniętych znaków w postaci codepoints
        input.offsetByCodePoints(0, 5) oblicza nowy indeks, który odpowiada początkowi 5 znaków Unicode w ciągu. To jest bezpieczny sposób, aby obsłużyć znaki Unicode, które mogą zajmować różną ilość jednostek kodu.
*/

/*
    codepoints są jednoznaczne dla każdego znaku Unicode i niezależne od używanego kodowania tekstu.*/
