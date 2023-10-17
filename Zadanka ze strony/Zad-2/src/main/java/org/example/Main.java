package org.example; //Oblicz odległość Hamminga pomiędzy dwiema niciami DNA.

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
      /*  List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        list1.add("A");
        list1.add("C");
        list1.add("T");
        list1.add("G");

        list2.add("G");
        list2.add("A");
        list2.add("C");
        list2.add("T");

        Hamming hamming = new Hamming();
        int hammingDistance = hamming.howMany(list1,list2);
        System.out.println("Hammington dystans= "+ hammingDistance);*/
        Hamming hamming = new Hamming("GATEMO", "GTCKMP");

        long distance = hamming.hamming();
        System.out.println("Odległość Hamminga: " + distance);
    }
}

  //  Jeśli porównamy dwie nici DNA i policzymy różnice między nimi, zobaczymy, ile błędów miało miejsce.

          /*  GAGCCCTACTAACGGGAT
              CATCGTAATGACGGCCT
              ^ ^ ^ ^ ^ ^^
        Mają 7 różnic, dlatego odległość Hamminga wynosi 7.*/