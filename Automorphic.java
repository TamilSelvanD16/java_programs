import java.util.*;
public class Automorphic
{
    public static void main(String args[])
    {
        System.out.print("the range of Automorphic numbers from 1 to 1000 is :  ");
        for(int num=1;num<=1000;num++)
        {
            int s=num * num;
            int t=num;
        }
        while(t>0)
        {
            if(s%10 != t%10)
            {
                break;
            }
            s/=10;
            t/=10;
        }
        if(temp==0)
        {
            System.out.println(num + " ");
        }
    }
}