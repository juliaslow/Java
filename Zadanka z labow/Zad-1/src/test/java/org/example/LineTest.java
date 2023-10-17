package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LineTest {

    private Line line;
    private Point start;
    private Point end;

    @BeforeEach
    public void init()
    {
        start = new Point(1,1);
        end= new Point(2,2);
        line = new Line(start,end);
    }

    @Test
    void move()
    {
        line.move(1,1);
        assertEquals(2, line.getStart().getX());
        assertEquals(2, line.getStart().getY());
        assertEquals(3, line.getEnd().getX());
        assertEquals(3, line.getEnd().getY());
    }

    @Test
    void flip()
    {
        line.flip();
        assertEquals(-1, line.getStart().getX());
        assertEquals(-1, line.getStart().getY());
        assertEquals(-2, line.getEnd().getX());
        assertEquals(-2, line.getEnd().getY());
    }

    @Test
    void getStart()
    {
        assertEquals(1, line.getStart().getX());
        assertEquals(1, line.getStart().getY());
    }

    @Test
    void getEnd()
    {
        assertEquals(2, line.getEnd().getX());
        assertEquals(2, line.getEnd().getY());
    }

    @Test
    void testToString()
    {
        String expected = "[1,1]->[2,2]";
        String actual = line.toString();
        assertEquals(expected,actual);
    }
}