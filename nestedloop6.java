import java.util.Scanner;
public class nestedloop6
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = in.nextInt();
        int i,j,k;
        for(i=1;i<n;i++)
        {
            for(j=n-i;j>1;j--)
            {
                System.out.print(" ");
            }
            for(k=1;k<=i;k++)
            {
                System.out.print(k);
            }
            for(k=i-1;k>0;k--)
            {
                System.out.print(k);
            }
        System.out.println(" ");
        }
    }
}
/*
Enter Number: 5
   1 
  121 
 12321 
1234321 
*/