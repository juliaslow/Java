package org.example;

public class Main {
    public static void main(String[] args)
    {
        Point start1 = new Point(1,1);
        Point end1 = new Point(2,2);
        Line line1 = new Line(start1,end1);

        System.out.println(start1);
        System.out.println(end1);


        start1.flip();
        System.out.println(start1);

        end1.flip();
        System.out.println(end1);

        start1.move(2,2);
        System.out.println(start1);

        end1.move(1,1);
        System.out.println(end1);

        System.out.println(line1);

        line1.flip();
        System.out.println(line1);

        line1.move(4,4);
        System.out.println(line1);

    }
}