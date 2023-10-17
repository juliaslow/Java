package org.example;
import java.util.Collections;
import java.util.List;

public class Polygon implements Figure {
    private List<Point> vertices;

    public Polygon(List<Point> vertices) {
        this.vertices = vertices;
    }

    public void move(double dx, double dy) {
        for (Point vertex : vertices) {
            vertex.move(dx, dy);
        }
    }
    public List<Point> getVertices() {
        return Collections.unmodifiableList(vertices);
    }

    public void flip() {
        for (Point vertex : vertices) {
            double newX = -vertex.getX();
            double newY = -vertex.getY();
            vertex.setPoint(newX, newY);
        }
    }
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Polygon other = (Polygon) o;
        return vertices.equals(other.vertices);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Polygon with vertices: ");
        for (Point vertex : vertices) {
            sb.append(vertex).append(", ");
        }
        sb.delete(sb.length() - 2, sb.length()); // Usunięcie ostatniego przecinka i spacji
        return sb.toString();
    }
}