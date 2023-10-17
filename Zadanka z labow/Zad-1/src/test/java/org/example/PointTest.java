package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {
    private Point point;

    @BeforeEach
    public void init() {
        point = new Point(1,1);
    }


    @Test
    void move()
    {
        point.move(1,1);
        assertEquals(2,point.getX());
        assertEquals(2,point.getY());
    }

    @Test
    void flip() {
       point.flip();
       assertEquals(-1,point.getX());
       assertEquals(-1,point.getY());
    }

    @Test
    void getX()
    {
       assertEquals(1,point.getX());
    }

    @Test
    void getY()
    {
        assertEquals(1,point.getY());
    }

    @Test
    void testToString()
    {
        String expected = "[1,1]";
        String actual = point.toString();
        assertEquals(expected, actual);
    }
}