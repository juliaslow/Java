package org.example;



public class Main
{
    public static void main(String[] args)
    {
        int[] testArgs = { -3, -1, 0, 1, 2, 4, 5 };

        System.out.println("Test metody factorial:");
        for (int x : testArgs) {
            try {
                int result = Factorial.factional(x);
                System.out.println("Silnia(" + x + ") = " + result);
            } catch (IllegalArgumentException e) {
                System.err.println("Błąd z "+ x +" : "+ e.getMessage());
            }
        }
        System.out.println("\n");

        System.out.println("Test metody factorial1:");
        for (int x : testArgs) {
            try {
                int result = Factorial.factional1(x);
                System.out.println("Silnia1(" + x + ") = " + result);
            } catch (MyException e) {
                System.err.println("Błąd z "+ x +" : "+ e.getMessage());
            }
        }
    }
}