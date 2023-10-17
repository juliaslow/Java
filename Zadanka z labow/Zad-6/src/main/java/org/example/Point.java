package org.example;

public class Point implements Figure {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }
    public void flip() {
        x = -x;
        y = -y;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Point other = (Point) o;
        return Double.compare(other.x, x) == 0 && Double.compare(other.y, y) == 0;
    }
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
