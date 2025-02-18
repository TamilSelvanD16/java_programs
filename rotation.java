import java.util.*;
class rotation
{
    public static void main(String args[])
    {
       int n=6;
       int r=15;
       int arr[]={10,20,5,1,3,2};
       for(int i=0;i<n;i++) 
       {
           System.out.print(arr[i] + " ");
       }System.out.println();
       r=r%n;
       int temp[]=new int[r];
       for(int i=0;i<r;i++)
       {
           temp[i]=arr[i];
       }
       for(int i=r;i<n;i++)
       {
           arr[i-r]=arr[i];
       }
       for(int i=0;i<r;i++)
       {
           arr[i+n-r]=temp[i];
       }
       for(int i=0;i<n;i++)
       {
           System.out.print(arr[i] + "\t");
           
       }
       
       
    }
}