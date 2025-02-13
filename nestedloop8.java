import java.util.Scanner;
public class nestedloop8
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n = in.nextInt();
		int i,j,k,l;
		for(i=n; i>=1; i--)
		{
			for(j=n; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(k=1; k<=i; k++) {
				if(k==1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			for(l=j; l>=1; l--) {
				if(l==1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}

			}
			System.out.println(" ");

		}
			for(i=2; i<=n; i++)
		{
			for(j=n; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(k=1; k<=i; k++) {
				if(k==1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			for(l=j; l>=1; l--) {
				if(l==1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}

			}
			System.out.println(" ");

	}
}
}