package org.example;

public class Point {
    private int x; // musza byc prywatne
    private int y;

    public Point(int x, int y)  //konstruktor
    {
        this.x = x;
        this.y = y;
    }

    public void move(int dx, int dy) //metoda-funkcja
    {
        x= x+dx;
        y= y+dy;
    }

    public void flip() //metoda
    {
        x = -x;
        y = -y;
    }

    public int getX() // do testow i toString()
    {
        return x;
    }

    public int getY() // do testow i toString()
    {
        return y;
    }

    public String toString()
    {
        return "[" + x + "," + y + "]";
    }

}
