package org.example;

import java.util.HashMap;
import java.util.Optional;

public class Darts
{
    int score(double x, double y) {
        double distance = Math.sqrt(x * x + y * y); //odleglosc od srodka
        return distance > 10  ? 0
                : distance > 5  ? 1
                : distance > 1 ? 5
                : 10;
    }
}
