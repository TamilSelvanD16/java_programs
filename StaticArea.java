import java.util.*;
class Area
{
 static Scanner in=new Scanner(System.in);
 static void area()
 {
  int a;
  System.out.print("Enter the Value : ");
  a=in.nextInt();
  System.out.println("Area of square=" +(a*a));
 }
 static void area(int a,int b)
 {
  System.out.println("Area of rectangle=" +(a*b));
 }
 static void area(double a)
 {
  System.out.println("Area of Circle=" +(3.14*a*a));
 }
 
}
public class StaticArea
{
 public static void main(String args[])
 {
  Area.area(8,7);
  Area.area();
  Area.area(9.08);
  
 }
}