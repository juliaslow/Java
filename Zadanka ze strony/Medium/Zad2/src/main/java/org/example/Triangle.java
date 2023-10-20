package org.example;

import java.util.ArrayList;
import java.util.List;

public class Triangle
{
    private List<Integer> sideOfTriangle = new ArrayList<>();



    public Triangle(int a, int b, int c)
    {
        if (a > 0 && b > 0 && c > 0 && a + b >= c && b + c >= a && a +c >= b)
        {
            sideOfTriangle.add(a);
            sideOfTriangle.add(b);
            sideOfTriangle.add(c);
        }
        else
        {
            throw new IllegalArgumentException("Długości boków muszą być większe od 0");
        }
    }
    public String kindOfTriangle()
    {
        int a = sideOfTriangle.get(0);
        int b = sideOfTriangle.get(1);
        int c = sideOfTriangle.get(2);

        return (a == b && b == c) ? "rownoboczny"
                : (a == b || b == c || a == c) ? "rownoramienny"
                : "róznoboczny";
    }
}
