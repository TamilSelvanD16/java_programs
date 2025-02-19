import java.util.*;

class sortedmatrix {
    public static void main(String[] args) {
        int a[][] = new int[3][3];
        int b[] = new int[9];
        int temp;
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Enter the matrix element at position (" + i + ", " + j + "): ");
                a[i][j] = in.nextInt();
            }
        }
        System.out.println("The Matrix:-");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The array:-");
        int k=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                b[k]=a[i][j];
                System.out.print(b[k]);
                k=k+1;
            }
        }
        for (int i = 0; i < b.length; i++) 
        {
            for (int j = i + 1; j < b.length; j++) 
            {
                if (b[i] > b[j]) 
                {
                    temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                }
            }
        }
        int d = 0;
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                a[i][j]=b[d++];
            }
        }
        System.out.println();
        System.out.println("Sorted Matrix:");
        int index = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        int r=0,c=0,curr=0,prev=0;
  while(r<3 && c<3)
  {
   if(r+2==3||c+2==3)
   {
    break;
    
   }
   prev=a[r+1][c];
   for(int i=c;i<3;i++)
   {
    curr=a[r][i];
    a[r][i]=prev;
    prev=curr;
   }
   r++;
    System.out.println("Previous value :"+prev);
  for(int i=0;i<3;i++)
  {
   for(int j=0;j<3;j++)
  {
   System.out.print(a[i][j]+" ");
  }
  System.out.println();
  }
   
    for(int j=r;j<3;j++)
   {
    curr=a[j][r+1];
    a[j][r+1]=prev;
    prev=curr;
   }
   c++;
       System.out.println("Previous value :"+prev);
       for(int i=0;i<3;i++)
  {
   for(int j=0;j<3;j++)
  {
   System.out.print(a[i][j]+" ");
  }
  System.out.println();
  }
   for(int j=3-2;j>=0;j--)
   {
    curr=a[c+1][j];
    a[c+1][j]=prev;
    prev=curr;
   }
   r--;
   System.out.println("Previous value :"+prev);
   for(int i=r+1;i<3-1;i++)
   {
    
    a[i][r]=prev;
    
   }
  }
  
  System.out.println("Swapped Matrix :");
  for(int i=0;i<3;i++)
  {
   for(int j=0;j<3;j++)
  {
   System.out.print(a[i][j]+ " ");
  }
  System.out.println();
  }
    }
}
