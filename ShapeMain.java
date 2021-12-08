import java.util.Scanner;
abstract class Shape
{
 double a, b;
 abstract void printArea();
}

class Rectangle extends Shape
{
 void getData (double x, double y)
 {
  a = x;
  b = y;
 }
 void printArea()
 {
  System.out.println ("Area of rectangle = " + (a*b));
 }
}

class Triangle extends Shape
{
 void getData (double x, double y)
 {
  a = x;
  b = y;
 }
 void printArea()
 {
  System.out.println ("Area of triangle = " + (double)(0.5*a*b));
 }
}

class Circle extends Shape
{
 void getData (double x)
 {
  a = x;
 } 
 void printArea()
 {
  System.out.println ("Area of circle: " + (double)(3.14*a*a));
 }
}

class ShapeMain
{
 public static void main(String[] args)
 {
  Scanner in = new Scanner (System.in);
  Rectangle r = new Rectangle();
  Triangle t = new Triangle();
  Circle c = new Circle();
  System.out.println ("\n1.Rectangle\n2.Triangle\n3.Circle\nEnter your choice: ");
  int ch = in.nextInt();
  switch (ch)
  {
   case 1: System.out.println ("Enter length and breadth: ");
   	   double l = in.nextDouble();
   	   double b = in.nextDouble();
   	   r.getData (l, b);
  	   r.printArea ();
           break;
  case 2: System.out.println ("Enter base and height: ");
	  double b1 = in.nextDouble();
	  double h = in.nextDouble();
	  t.getData (b1, h);
	  t.printArea ();
 	  break;
  case 3: System.out.println ("Enter radius: ");
	double r1 = in.nextDouble();
        c.getData (r1);
        c.printArea ();
	break;
  default: System.out.println ("Invalid input.");
  }
 }
}