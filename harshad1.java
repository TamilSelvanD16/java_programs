import java.util.*;
class harshad1{
    public static void main(String t[])
    {
        System.out.print("Enter Number :");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int count=0;
        {
            int s=0;
            int a=n;
            while(a>0)
            {
                s=s+a%10;
                a/=10;
            }
            if(n%s==0)
            {
                count++;
                System.out.println("It is a Harshad number " + n);
            }
            else{
                System.out.println("It is not a Harshad number");
            }
        }

    }
}