package org.example;

public interface Figure
{
   void move(double dx, double dy); //przesuwającą daną figurę
   void flip();// przerzucająca dana figurę
   boolean equals(Object o);// sprawdzającą, czy figury są równe
   String toString(); //zwracająca łańcuch znaków (String) reprezentujący daną figurę
}
