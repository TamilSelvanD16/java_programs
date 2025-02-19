import java.util.*;
public class swapedmatrix
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the row :");
  int row=sc.nextInt();
  System.out.println("Enter the column :");
  int column=sc.nextInt();
  int arr[][]=new int[row][column];
  System.out.println("Enter the array numbers:");
  for(int i=0;i<row;i++)
  {
   for(int j=0;j<column;j++)
   {
       System.out.println("Enter element at position [" + i +"][" + j +"] : ");

   arr[i][j]=sc.nextInt();
  }
  }
  for(int i=0;i<row;i++)
  {
   for(int j=0;j<column;j++)
  {
   System.out.print(arr[i][j]);
  }
  System.out.println();
  }
  int r=0,c=0,curr=0,prev=0;
  while(r<row && c<column)
  {
   if(r+2==row||c+2==column)
   {
    break;
    
   }
   prev=arr[r+1][c];
   for(int i=c;i<column;i++)
   {
    curr=arr[r][i];
    arr[r][i]=prev;
    prev=curr;
   }
   r++;
    System.out.println("Previous value :"+prev);
  for(int i=0;i<row;i++)
  {
   for(int j=0;j<column;j++)
  {
   System.out.print(arr[i][j]);
  }
  System.out.println();
  }
   
    for(int j=r;j<column;j++)
   {
    curr=arr[j][r+1];
    arr[j][r+1]=prev;
    prev=curr;
   }
   c++;
       System.out.println("Previous value :"+prev);
       for(int i=0;i<row;i++)
  {
   for(int j=0;j<column;j++)
  {
   System.out.print(arr[i][j]);
  }
  System.out.println();
  }
   for(int j=column-2;j>=0;j--)
   {
    curr=arr[c+1][j];
    arr[c+1][j]=prev;
    prev=curr;
   }
   r--;
   System.out.println("Previous value :"+prev);
   for(int i=r+1;i<column-1;i++)
   {
    
    arr[i][r]=prev;
    
   }
  }
  
  System.out.println("Swapped Matrix :");
  for(int i=0;i<row;i++)
  {
   for(int j=0;j<column;j++)
  {
   System.out.print(arr[i][j]+ " ");
  }
  System.out.println();
  }
  
 }
}
/*
Enter the row :
3
Enter the column :
3
Enter the array numbers:
Enter element at position [0][0] : 
1
Enter element at position [0][1] : 
2
Enter element at position [0][2] : 
3
Enter element at position [1][0] : 
4
Enter element at position [1][1] : 
5
Enter element at position [1][2] : 
6
Enter element at position [2][0] : 
7
Enter element at position [2][1] : 
8
Enter element at position [2][2] : 
9
123
456
789
Previous value :3
412
456
789
Previous value :9
412
453
786
Previous value :7
Swapped Matrix :
4 1 2 
7 5 3 
8 9 6 

*/