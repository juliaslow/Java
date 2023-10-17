package org.example;

public class Line implements Figure {
   private Point start;
   private Point end;

   public Line(Point start, Point end) {
      this.start = start;
      this.end = end;
   }

   public void move(double dx, double dy) {
      start.move(dx, dy);
      end.move(dx, dy);
   }

   public void flip() {
      Point temp = start;
      start = end;
      end = temp;
   }
   public boolean equals(Object o) {
      if (this == o) {
         return true;
      }
      if (o == null || getClass() != o.getClass()) {
         return false;
      }
      Line other = (Line) o;
      return start.equals(other.start) && end.equals(other.end);
   }

   public String toString() {
      return "Line from " + start + " to " + end;
   }
   public Point getStart() {
      return start;
   }

   public Point getEnd() {
      return end;
   }

}