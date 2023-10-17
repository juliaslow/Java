package org.example;

import java.util.List;
import java.util.stream.IntStream;

public class Hamming
{
    private final String leftStrand;
    private final String rightStrand;

    public Hamming(String leftStrand, String rightStrand)
    {
        if(!(leftStrand.length() ==rightStrand.length()) && !leftStrand.isEmpty() && !rightStrand.isEmpty())
        {
            throw new IllegalArgumentException("Sekwencje musza byc tej samej długosci i nie moga byc puste")  ;
        }

        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
    }

    public long hamming()
    {
        return IntStream.range(0, leftStrand.length()) //IntSteam - Zwraca strumień składający się z elementów tego strumienia pasujących do podanego predykatu.
                .filter(i->leftStrand.charAt(i) != rightStrand.charAt(i))
                .count();
    }
    public int howMany(List<String> list1, List<String> list2)
    {
        if(list1.size() != list2.size() && !list1.isEmpty() && !list2.isEmpty())
        {
            throw new IllegalArgumentException("Sekwencje musza byc tej samej długosci");
        }
        int distance = 0;
        for(int i = 0; i < list1.size(); i++)
        {
            if(!list1.get(i).equals(list2.get(i)))
            {
                distance++;
            }
        }
        return distance;
    }

}
