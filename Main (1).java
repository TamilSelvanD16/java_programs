class Shape
{
    void Area(){
    
        System.out.println("Area of the Shape");
    }
}
class Rectangle extends Shape
{
    double length,breadth;
    Rectangle(double length,double breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    void Area()
    {
        super.Area();
        System.out.println("Area of the Rectangle : " + length*breadth);
    }
}

public class Main 
{
    public static void main(String s[])
    {
        Rectangle myArea=new Rectangle(12.0,13.0);
        myArea.Area();
        
    }
}