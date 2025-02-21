import java.util.*;
class Add{
 private int a,b,c;
 private void input()
  {
   Scanner in=new Scanner(System.in);
   System.out.print("Enter a value :");
   a=in.nextInt();
   System.out.print("Enter b value :");
   b=in.nextInt();
  }

public void sum()
{
   input();
   c=a+b;
   System.out.println("Sum is " + c);
}
}
class Addition2
{
 public static void main(String args[])
 {
  Add obj=new Add();
  obj.sum();
 }
}

 