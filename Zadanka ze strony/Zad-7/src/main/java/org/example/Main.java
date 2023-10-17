package org.example;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*System.out.println("Podaj sekretna liczbe");
        Scanner scanner = new Scanner(System.in);
        int podanaLiczba = scanner.nextInt();*/

       /* Raindrops raindrops = new Raindrops();
        String signals = raindrops.rainSignals(podanaLiczba);
        System.out.println("Liczba " + podanaLiczba + " po przeksztalceniu w dzwieki kropel to:"+ signals);
*/
        Raindrops raindrops = new Raindrops();
        int[] numbers = {3, 5, 7, 15, 105, 34};

        for (int number : numbers) {
            String result = raindrops.rain(number);
            System.out.println("Liczba " + number + " po przeliczeniu daje operacje tajnego komunikatu:");
            System.out.println(result);
        }
    }
}