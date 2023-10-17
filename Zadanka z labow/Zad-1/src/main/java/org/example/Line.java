package org.example;

public class Line {

    private Point start;  // linia sklada sie z punktow
    private Point end;


    public Line(Point start, Point end)  //konstruktor
    {
        this.start = start;
        this.end = end;
    }

    public void move(int dx, int dy) // przesuwanie obu punktow o dx i dy
    {
        start.move(dx, dy); // ruszamy punkt start o dx, dy (wektor)
        end.move(dx,dy);
    }

    public void flip()
    {
        start.flip();
        end.flip();
    }

    public Point getStart()
    {
        return start;
    }

    public Point getEnd()
    {
        return end;
    }

    public String toString()
    {
        return start.toString() + "->" + end.toString();  // konwertowanie Point na String
    }
}
















/*Zaimplementuj klasy Point i Line odpowiadające odpowiednio punktom i liniom w przestrzeni dwuwymiarowej z odpowiednimi konstruktorami.
Klasy te mają zawierać metodę move pozwalającą na przesuwanie punktów i linii o wektor oraz metodę flip pozwalającą na przerzucanie symetryczne względem początku układu współrzędnych.
 Należy napisać testy metod i konstruktorów. Ile parametrów powinna mieć metoda move?
Wskazówka: w celu testowania należy zaimplementować odpowiednio metodę toString() zwracającą dla danego obiektu reprezentujący go string.
*/