package org.example;

import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Podaj sekretna liczbe");
        Scanner scanner = new Scanner(System.in);
        int podanaLiczba = scanner.nextInt();

        SecretHandshake secretHandshake = new SecretHandshake();
        try {
            List<Signal> signals = secretHandshake.calculateSingnal(podanaLiczba);

            System.out.println("Liczba " + podanaLiczba + " po przeliczeniu daje operacje tajnego komunikatu:");
            for (Signal signal : signals) {
                System.out.println(signal);
            }
        }
        catch (IllegalArgumentException e)
        {
            System.err.println("Bład: " + e.getMessage());
        }
    }
}