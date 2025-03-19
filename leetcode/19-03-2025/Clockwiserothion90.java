import java.util.*;
class Clockwiserothion90 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the row: ");
        int row=sc.nextInt();
        System.out.print("Enter the column: ");
        int column=sc.nextInt();
        int A[][]=new int[row][column];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < row; i++) 
        {
            for (int j = 0; j < column; j++) 
            {
                System.out.print("Enter the matrix element at position (" + i + ", " + j + "): ");
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Given Matrix: ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        // System.out.println("Spiral Order:");
        // int top = 0,bottom=r-1,left=0,right=c-1;
        
        // while(top<=bottom&&left<=right)
        // {
        //     for(int i=left;i<=right;i++)
        //     {
        //         System.out.print(a[top][i] + " ");
        //     }
        //     top++;
        //     for (int i=top;i<=bottom;i++) {
        //         System.out.print(a[i][right] + " ");
        //     }
        //     right--;
        //     if(top<=bottom) {
        //         for(int i=right;i>=left; i--)
        //         {
        //             System.out.print(a[bottom][i] + " ");
        //         }
        //         bottom--;
        //     }
        //     if (left<=right) 
        //     {
        //         for (int i=bottom;i>=top;i--)
        //         {
        //             System.out.print(a[i][left] + " ");
        //         }
        //         left++;
        //     }
        // }
        
        
         for (int i = 0; i < row; i++) {
            for (int j = i; j < column; j++) {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }
        System.out.println("Transpose Matrix :");
          for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
       
        System.out.println("90 degree clockwise rotation :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row / 2; j++) {
                int temp = A[i][j];
                A[i][j] = A[i][row - j - 1];
                A[i][row - j - 1] = temp;
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("90 degree Anticlockwise rotation :");
        for (int i = 0; i < row; i++) {
            for (int j = i; j < column; j++) {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }
        
        //   for(int i=0;i<row;i++)
        // {
        //     for(int j=0;j<column;j++)
        //     {
        //         System.out.print(A[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        
        for (int i = 0; i < row; i++) {
            for (int j = 0, k = column - 1; j < k; j++, k--) {
                int temp = A[j][i];
                A[j][i] = A[k][i];
                A[k][i] = temp;
            }
        }
    
    
          for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }

        
        
    }
}
/*
Enter the row: 3
Enter the column: 3
Enter matrix elements:
Enter the matrix element at position (0, 0): 1
Enter the matrix element at position (0, 1): 2
Enter the matrix element at position (0, 2): 3
Enter the matrix element at position (1, 0): 4
Enter the matrix element at position (1, 1): 5
Enter the matrix element at position (1, 2): 6
Enter the matrix element at position (2, 0): 7
Enter the matrix element at position (2, 1): 8
Enter the matrix element at position (2, 2): 9
Given Matrix: 
1 2 3 
4 5 6 
7 8 9 
Transpose Matrix :
1 4 7 
2 5 8 
3 6 9 
90 degree clockwise rotation :
7 4 1 
8 5 2 
9 6 3 
90 degree Anticlockwise rotation :
1 2 3 
4 5 6 
7 8 9 

*/
