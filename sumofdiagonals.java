import java.util.*;
public class sumofdiagonals
{
 public static void main(String args[])
 {
  Scanner scn=new Scanner(System.in);
  System.out.print("enter the row:");
  int row=scn.nextInt();
  System.out.print("enter the column:");
  int column=scn.nextInt();
  int arr[][]=new int[3][3];
  for(int i=0;i<3;i++)
  {
   for(int j=0;j<3;j++)
   {
    arr[i][j]=scn.nextInt();
   }
  }
  System.out.println("The Matrix is :");
  for(int i=0;i<row;i++)
  {
   for(int j=0;j<column;j++)
   {
    System.out.print(arr[i][j]+" ");
   }
   System.out.println();
  }
  int a=arr[0][1]+arr[0][2]+arr[1][2];
  int b=arr[1][0]+arr[2][0]+arr[2][1];
  arr[0][0]=a;
  arr[2][2]=b;
  for(int i=0;i<3;i++)
  {
   for(int j=0;j<3;j++)
   {
    System.out.println(arr[i][j]);
   }
   System.out.println("");
  }
 }
}
 