import java.util.*;
class Shape
{
 protected double Area;
 public void Calculate_area()
 {
  System.out.println("Area of shape :");
 }
}
class Circle extends Shape{
 private int r;
 public void Calculate_area()
 {
  Scanner in = new Scanner(System.in);
  System.out.print("Enter value  :");
  r=in.nextInt();
  Area=3.14*r*r;
  System.out.println("Area of Circle : " +Area);
 }
}
class Square extends Shape{
 private int a;
 public void Calculate_area()
 {
  Scanner in=new Scanner(System.in);
  System.out.print("Enter value :");
  a=in.nextInt();
  Area=a*a;
  System.out.print("Area of Square : " +Area);
 
 }
}
public class Protector
{
 public static void main(String args[])
 {
  Shape x=new Circle();
  x.Calculate_area();
  Shape y=new Square();
  y.Calculate_area();
 }
}

