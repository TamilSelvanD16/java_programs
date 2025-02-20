import java.util.*;
public class class1{
 
 void get(String R,int N)
  {
    System.out.println("Name: " + R);
    System.out.println("Regno: " + N);
  }
  public static void main(String[] args) {
   Scanner scn=new Scanner(System.in);
  System.out.print("Enter your Name:");
  String name=scn.nextLine();
  System.out.print("Enter your Regno:");
  int regno=scn.nextInt();
  
    class1 myObj = new class1();
    myObj.get(name,regno);
   
  }
  
}
/*
Enter your Name:Tamil
Enter your Regno:178
Name: Tamil
Regno: 178
*/
