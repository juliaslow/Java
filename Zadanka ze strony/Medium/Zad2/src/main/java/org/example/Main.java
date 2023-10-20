package org.example;

public class Main {
    public static void main(String[] args) {
        try {
            Triangle triangle1 = new Triangle(5, 5, 5);
            Triangle triangle2 = new Triangle(4, 5, 5);
            Triangle triangle3 = new Triangle(4, 5, 3);
            System.out.println("Rodzaj trójkąta: " + triangle1.kindOfTriangle());
            System.out.println("Rodzaj trójkąta: " + triangle2.kindOfTriangle());
            System.out.println("Rodzaj trójkąta: " + triangle3.kindOfTriangle());
        } catch (IllegalArgumentException e) {
            System.out.println("Błąd: " + e.getMessage());
        }
    }
}