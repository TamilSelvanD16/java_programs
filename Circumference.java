import java.util.*;
abstract class Circle
{
    static double area,circumference;
    static Scanner in=new Scanner(System.in);
    static void area(){
    double r;
    System.out.print("Enter r value : ");
    r=in.nextInt();
    area=3.14*r*r;
    System.out.println("Area = " + area);
    }
    static void circumference(){
        double c;
        System.out.print("Enter c value : ");
        c=in.nextInt();
        circumference=2*3.14*c;
        System.out.print("circumference = " + circumference);
    }
}
public class Circumference
{
    public static void main(String T[])
    {
        Circle.area();
        Circle.circumference();
    }
}
         
   