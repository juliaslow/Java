package org.example;

import java.math.BigInteger;

public class Grains
{
     static BigInteger grainOfEachSquare(int squareNumber)
    {
      return BigInteger.valueOf(2).pow(squareNumber - 1);
    }   //BigInteger nie ma ograniczeń co do zakresu liczby, którą może przechowywać.

     static BigInteger grainsOnBoard() {
            return BigInteger.valueOf(2).pow(64).subtract(BigInteger.ONE);
        }  //subtract(BigInteger.ONE); - odemujemy 1




}