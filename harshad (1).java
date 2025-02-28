import java.util.*;
class harshad{
    public static void main(String t[])
    {
        int count=0;
        for(int n=500;n<=2500;n++)
        {
            int s=0;
            int a=n;
            while(a>0)
            {
                s+=a%10;
                a/=10;
            }
            if(n%s==0)
            {
                count++;
                System.out.println(n);
            }
        }
                    System.out.println("The total harshad numbers :" + count);

    }
}