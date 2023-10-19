package org.example;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args)
    {
        int squareNumber = 5; // Wprowadź numer kwadratu, dla którego chcesz obliczyć ilość ziaren
        BigInteger grainsOnSquare =  Grains.grainOfEachSquare(squareNumber);
        System.out.println("Liczba ziaren na kwadracie " + squareNumber + ": " + grainsOnSquare);
        BigInteger totalGrains = Grains.grainsOnBoard();
        System.out.println("Całkowita liczba ziaren na szachownicy: " + totalGrains);
    }

}