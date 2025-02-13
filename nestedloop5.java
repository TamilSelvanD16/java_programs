import java.util.Scanner;
public class nestedloop5
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=in.nextInt();
        int k;
        for(int i=1;i<n;i++)
        {
            for(int j=n-i;j>1;j--)
            {
                System.out.print(" ");
                
            }
            for(k=1;k<i;k++)
            {
                System.out.print("1");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("1");
            }
        System.out.println();
        }
    }
}
/*
Enter Number: 5
   1
  111
 11111
1111111
*/