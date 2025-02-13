import java.util.Scanner;
public class nestedloop4
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=in.nextInt();
        int k;
        for(int i=1;i<=n;i++)
        {
            for(int j=n-i;j>=1;j--)
            {
                System.out.print(" ");
                
            }
            for(k=1;k<=i;k++)
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
   11
  111
 1111
11111
*/