import java.util.*;
class Shape
{
    final float pi=3.14f;
    public double area;
    public void display(int a)
    {
        area=a*a;
        System.out.println("Area of the Square :"+area);
    }
}
class Rectangle extends Shape
{
    private int l,b;
    void display(int l,int b)
    {
        area=l*b;
        System.out.println("Area of the Rectangle :"+area);
    }
}
class Circle extends Shape
{
    private float r;
    void display(float r)
    {
        area=pi*r;
        System.out.println("Area of the Circle :"+area);
    }
}
class Triangle extends Shape
{
    private int b,h;
    void display(int b,int h)
    {
        area=0.5*b*h;
        System.out.println("Area of the Triangle :"+area);
    }
}
class FinalArea
{
	public static void main(String[] args) {
		Shape obj= new Shape();
		obj.display(4);
		Rectangle robj=new Rectangle();
		robj.display(4,5);
		Triangle tobj=new Triangle();
		tobj.display(4,5);
		Circle cobj=new Circle();
		cobj.display(5.54f);
	}
}
/*
Area of the Square :16.0
Area of the Rectangle :20.0
Area of the Triangle :10.0
Area of the Circle :17.395601272583008
*/