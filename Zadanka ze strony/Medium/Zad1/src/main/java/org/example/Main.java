package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String matrixAsString = "1 2 3\n4 5 6\n7 8 9";

        // Tworzenie obiektu Matrix
        Matrix matrix = new Matrix(matrixAsString);
        System.out.println("MACIERZ: ");
        matrix.printMatrix();
        // Pobieranie wiersza o numerze 2
        int[] row2 = matrix.getRow(2);
        System.out.println("Wiersz 2: " + Arrays.toString(row2));

        // Pobieranie kolumny o numerze 3
        int[] col3 = matrix.getColumn(3);
        System.out.println("Kolumna 3: " + Arrays.toString(col3));


    }
}