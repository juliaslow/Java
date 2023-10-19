package org.example;

import java.util.Arrays;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        ResistorColorDuo resistorColorDuo = new ResistorColorDuo();

        String[] colors = {"brown", "green", "red"};
        int value = resistorColorDuo.value(colors);
        String colorCode = resistorColorDuo.colorCode(colors);
        System.out.println("Wartość opornika dla kolorów " + colorCode + " wynosi " + value);
    }
        //System.out.println("Hello world!");
    }
   /* int value(String[] colors) {
        String resistorValue = Arrays.stream(colors).limit(2)
                .map(color -> values.valueOf(color).getValue())
                .collect(Collectors.joining());
        return Integer.parseInt(resistorValue);
    }*/

