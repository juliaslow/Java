package org.example;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        // Tworzenie punktów
        Point point1 = new Point(2.0, 3.0);
        Point point2 = new Point(5.0, 7.0);

        // Tworzenie linii
        Line line = new Line(point1, point2);

        // Tworzenie wielokąta
        List<Point> vertices = new ArrayList<>();
        vertices.add(new Point(1.0, 1.0));
        vertices.add(new Point(3.0, 4.0));
        vertices.add(new Point(6.0, 2.0));
        Polygon polygon = new Polygon(vertices);

        // Tworzenie grupy figurowej
        List<Figure> figures = new ArrayList<>();
        figures.add(line);
        figures.add(polygon);
        Group group = new Group(figures);

        // Wyświetlanie informacji o figurach
        System.out.println("Point: " + point1);
        System.out.println("Point: " + point2);
        System.out.println("Line: " + line);
        System.out.println("Polygon: " + polygon);
        System.out.println("Group: " + group);

        // Przesuwanie figur
        line.move(1.0, 1.0);
        polygon.move(-2.0, 0.0);
        group.move(0.0, -1.0);

        // Wyświetlanie zaktualizowanych informacji o figurach
        System.out.println("\n--- Po przesunięciu ---");
        System.out.println("Line: " + line);
        System.out.println("Polygon: " + polygon);
        System.out.println("Group: " + group);

        // Odwracanie figur
        line.flip();
        polygon.flip();
        group.flip();

        // Wyświetlanie zaktualizowanych informacji o figurach
        System.out.println("\n--- Po odwróceniu ---");
        System.out.println("Line: " + line);
        System.out.println("Polygon: " + polygon);
        System.out.println("Group: " + group);

        // Sprawdzanie równości figur
        Point point3 = new Point(2.0, 3.0);
        System.out.println("\nCzy point1 jest równy point3? " + point1.equals(point3));
        System.out.println("Czy line jest równy line? " + line.equals(line));

        // Porównywanie figur w grupie
        List<Figure> groupFigures = group.getFigures();
        System.out.println("\nCzy line jest równy figurom w grupie? ");
        for (Figure figure : groupFigures) {
            System.out.println(line.equals(figure));
        }
    }
}
