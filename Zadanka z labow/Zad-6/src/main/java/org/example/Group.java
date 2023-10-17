package org.example;

import java.util.ArrayList;
import java.util.List;


public class Group implements Figure {
    private List<Figure> figures;

    public Group(List<Figure> figures) {
        this.figures = new ArrayList<>(figures);
    }

    public List<Figure> getFigures() {
        return new ArrayList<>(figures);
    }


    public void move(double dx, double dy) {
        for (Figure figure : figures) {
            figure.move(dx, dy);
        }
    }

    public void flip() {
        for (Figure figure : figures) {
            figure.flip();
        }
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Group other = (Group) o;
        return figures.equals(other.figures);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Group of figures: ");
        for (Figure figure : figures) {
            sb.append(figure.toString());
            sb.append(", ");
        }
        if (sb.length() > 2) {
            sb.setLength(sb.length() - 2);  // Usunięcie ostatniego przecinka i spacji
        }
        return sb.toString();
    }
}
