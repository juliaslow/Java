package org.example;

public class Main
{
    public static void main(String[] args)
    {
        String word = "happy";
        System.out.println("Słowo do odwrocenia: " + word);
        ReverseString reverseString = new ReverseString();
        String result = reverseString.revere(word);
        System.out.println(result);

    }
}