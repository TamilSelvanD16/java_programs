import java.util.*;
class Add{
 private int a,b,c;
 public void sum()
 {
  Scanner in =new Scanner(System.in);
  System.out.print("Enter a value :");
  a=in.nextInt();
  System.out.print("Enter b value  :");
  b=in.nextInt();
  c=a+b;
  System.out.print("Sum is " + c);
 }
}
class Addition
 {
  public static void main(String args[])
  {
   Add y=new Add();
   y.sum();
  }
 }
