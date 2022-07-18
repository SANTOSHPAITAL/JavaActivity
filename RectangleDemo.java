//defult constructor
class Rectangle
{
double width;
double height ;
//This is the constructor for rectangle.
Rectangle()
{
System.out.println("Constructing Rectangle");
width = 10;
height = 10;
}

// compute and return area
double area()
{
return width * height;
}
}

class RectangleDemo
{
public static void main(String args[]){
// declare, allocate, and initialize Rectangle objects
Rectangle rec1= new Rectangle();
Rectangle rec2 = new Rectangle();
double area;
// get area of first rectangle
area = rec1.area();
System.out.println("area is " +area);
// get area of second rectangle
area = rec2.area();
System.out.println("area is "+area );
}
}
