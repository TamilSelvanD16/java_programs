import java.util.Scanner;
public class nestedloop3
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=in.nextInt();
        int k=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(k + " ");
                k++;
            }
        System.out.println();
        }
    }
}
/*
Enter Number: 5

1 
2 3 
4 5 6 
7 8 9 10 
*/