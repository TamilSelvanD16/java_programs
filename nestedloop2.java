import java.util.Scanner;
public class nestedloop2
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=in.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j +" ");
            }
        System.out.println();
        }
    }
}
/*
Enter Number: 5
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5
*/