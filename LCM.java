import java.util.*;
class LCM{
    public static void main(String args[])
    {
        System.out.print("Enter the Number :");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.print("Enter the Divident number:");
        int v=in.nextInt();
        if(v!=2)
        {
            if(v!=8)
            {
                if(v!=16)
                {
                    System.out.println("Invalid");
                }
            }   
        }
        else
        {
        String string="";
        while(n>0)
        {
            int d=n%v;
            string =d+string;
            n/=v;
        }
        System.out.println("The value is " +string);
        }
    }
}