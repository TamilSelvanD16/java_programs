class no_of_digits
{
    public static void main(String m[])
    {
        int n= 596;
        int count=0;
        while(n>0)
        {
            int r=n%10;
            n=n/10;
            count++;
        }
        System.out.println("No of digits :" +count);
    }
}
/*
No of digits :3
*/