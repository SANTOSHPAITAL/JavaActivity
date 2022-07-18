//parameterized constructor
import java.io.*;
class Rectangle
{
double width;
double height;
// This is the constructor for Rectangle.
Rectangle (double w, double h){
width = w;
height = h;
}
double area()
{
return width * height;
}
}
// compute and return area


public class Rectangle_Demo
{
public static void main(String args[])
{
// declare, allocate, and initialize Rectangle objects.
Rectangle rec1= new Rectangle (10, 20);
Rectangle rec2=new Rectangle (3, 6);
double area;
// get area of first rectangle
area = rec1.area();
System.out.println ("area is " +area);
// get area of second rectangle.
area = rec2.area();
System.out.println ("area is " +area);
}
}