import java.util.Scanner;
public class nestedloop7
{
	public static void main(String[] args) 
	{
	    int num=1;
        int n=5, i, j, k;
	    for(i=1;i<=n;i++)
		{
		    for(j=1;j<=n-i;j++)
		    {
		        System.out.print(" ");
		    }
		    for(k=1;k<=i;k++)
		    {
		        System.out.print("* ");
		    }
		 System.out.println();
		}
		for(i=n-1;i>=1;i--)
		{
		    for(j=1;j<=n-i;j++)
		    {
		        System.out.print(" ");
		    }
		    for(k=1;k<=i;k++)
		    {
		        System.out.print("* ");
		    }
		  System.out.println();
		}
    }
}
/*
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
 * * * * 
  * * * 
   * * 
    *
*/
