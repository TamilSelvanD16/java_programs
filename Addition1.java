import java.util.*;
class Add{
 public int a,b,c;
 public void sum()
  {
   System.out.println("Sum is " + c);
   
  }
}
 public class Addition1
 {
  public static void main(String args[])
  {
   Add obj=new Add();
   Scanner in =new Scanner(System.in);
   System.out.print("Enter a value :");
   obj.a=in.nextInt();
   System.out.print("Enter b value :");
   obj.b=in.nextInt();
   obj.c=obj.a+obj.b;
   obj.sum();
  }
 }
 