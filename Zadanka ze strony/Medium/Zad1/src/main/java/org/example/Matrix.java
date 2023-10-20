package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Matrix
{
    private int[][] matrix;
    Matrix(String matrixAsString) {
        matrix = Arrays.stream(matrixAsString.split("\n")) // Tworzy strumień z reprezentacji macierzy jako ciągu znaków, dzieląc ją na wiersze za pomocą znaku nowej linii ("\n"). Każdy element strumienia reprezentuje wiersz. Dla matrixAsString = "1 2 3\n4 5 6", strumień będzie zawierał dwa elementy: "1 2 3" i "4 5 6".
                .map(row -> Arrays.stream(row.split("\\s")) //jest strumień do dzielenia wiersza na liczby za pomocą spacji
                        .mapToInt(Integer::parseInt).toArray()) // parseInt jest używana do konwersji ciągu znaków na liczbę całkowit. Dla wiersza "1 2 3", przekształca go w tablicę [1, 2, 3].
                .toArray(int[][]::new); //Konwertuje strumień wierszy przekształconych na tablice wierszy int[][].
    }

    int[] getRow(int rowNumber) {//wraca wiersz o podanym numerze jako tablicę liczb całkowityc
        return matrix[rowNumber - 1];
    }
    int[] getColumn(int columnNumber) {//zwraca kolumnę o podanym numerze jako tablicę liczb całkowitych
        return Arrays.stream(matrix).mapToInt(row -> row[columnNumber - 1]).toArray(); //Mapuje każdy wiersz macierzy na wartość w kolumnie o danym numerze i kolekcjonuje wyniki w tablicę liczb całkowitych.
    }//columnNumber - 1 jest to numer index
    public void printMatrix() {
        Arrays.stream(matrix) // Tworzy strumień z macierzy int[][], który pozwala na przetwarzanie wierszy jako elementów strumienia.
                .map(row -> Arrays.stream(row) //Dla każdego wiersza w macierzy przekształca go w łańcuch znaków, gdzie liczby oddzielone są spacjami i łączy te łańcuchy w jedną linię, reprezentującą wiersz macierzy., Dla wiersza [1, 2, 3], przekształca go w "1 2 3".
                        .mapToObj(Integer::toString)
                        .collect(Collectors.joining(" ")))
                .forEach(System.out::println);
    }
}
