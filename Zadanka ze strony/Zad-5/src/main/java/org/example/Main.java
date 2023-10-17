package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Podaj liczbe z ktorej chcesz obliczyc różnicę między kwadratem sumy a sumą kwadratów pierwszych N liczb naturalnych.");
        Scanner scanner = new Scanner(System.in);
        int podanaLiczba = scanner.nextInt();

        DifferenceOfSquares differenceOfSquares = new DifferenceOfSquares(podanaLiczba);
        System.out.println("Podana liczba: " + podanaLiczba +"Kwadrat sumy = " + differenceOfSquares.kwadratSumy(podanaLiczba) + ", suma kwadratow = "+ differenceOfSquares.sumaKwadratow(podanaLiczba));
        System.out.println("Róznica miedzy wynikami = "+ differenceOfSquares.result(podanaLiczba));
    }
}