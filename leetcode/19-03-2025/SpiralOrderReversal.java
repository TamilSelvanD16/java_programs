import java.util.*;
class SpiralOrderReversal 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the row: ");
        int r=sc.nextInt();
        System.out.print("Enter the column: ");
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++) 
        {
            for (int j = 0; j < c; j++) 
            {
                System.out.print("Enter the matrix element at position (" + i + ", " + j + "): ");
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Given Matrix: ");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Spiral Order:");
        int top = 0,bottom=r-1,left=0,right=c-1;
        
        while(top<=bottom&&left<=right)
        {
            for(int i=left;i<=right;i++)
            {
                System.out.print(a[top][i] + " ");
            }
            top++;
            for (int i=top;i<=bottom;i++) {
                System.out.print(a[i][right] + " ");
            }
            right--;
            if(top<=bottom) {
                for(int i=right;i>=left; i--)
                {
                    System.out.print(a[bottom][i] + " ");
                }
                bottom--;
            }
            if (left<=right) 
            {
                for (int i=bottom;i>=top;i--)
                {
                    System.out.print(a[i][left] + " ");
                }
                left++;
            }
        }
    }
}
