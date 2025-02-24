import java.util.*;
abstract class Example 
{
    static int staticvariable;
    static int finalvariable;
    static final int static_final_variable; 

Example()
{
    this.finalvariable=100;
}
static
{
    static_final_variable=200;
}
   abstract void abstractmethod(); 
}
class Problem extends Example
{
    void abstractmethod(){
        System.out.println("Abstract method is implemented");
    }
}
class StaticFinal{
    public static void main(String t[])
    {
        Problem obj=new Problem();
        System.out.println("Static variable : " + Example.staticvariable);
        System.out.println("Final variable : " + obj.finalvariable);
        System.out.println("Static_Final_variable : " + Example.static_final_variable);
    }
}