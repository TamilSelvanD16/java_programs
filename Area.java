import java.util.*;
abstract class Circle
{           
    protected double area;
    abstract void calc_area();
}
class Area extends Circle 
{
    private double r;
    public Area()
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the value :");
        r=in.nextDouble();
    }
    void calc_area()
    {
        area=3.14*r*r;
        System.out.println("Area =" + area);
    }
    public static void main(String T[])
    {
        Area j=new Area();
        j.calc_area();
    }
}