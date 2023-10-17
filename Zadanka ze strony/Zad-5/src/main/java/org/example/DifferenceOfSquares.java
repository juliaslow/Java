package org.example;

import java.util.stream.IntStream;

public class DifferenceOfSquares
{
    int number;
    public DifferenceOfSquares(int podanaLiczba)
    {
        this.number = podanaLiczba;
    }

    public int kwadratSumy(int number)
    {
        int suma =  IntStream.range(1,number+1)
                .sum();
        return suma*suma;
/*
        return IntStream.rangeClosed(1,input).parallel()
                .map(i -> (int) Math.pow(i,2))
                .sum();
*/
    }

    public int sumaKwadratow(int number)
    {
       return IntStream.range(1,number+1)
               .map(i->i*i)
               .sum();
       // return (int) Math.pow(IntStream.rangeClosed(1, input).sum(), 2);
    }
    public int result(int number)
    {
//        int kwadratSumy = kwadratSumy(number);
//        int sumaKwadratow = sumaKwadratow(number);
        return kwadratSumy(number) - sumaKwadratow(number);
        //return wynik;
    }
}
