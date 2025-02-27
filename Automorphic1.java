class Automorphic1
{
    public static void main(String args[])
    {
        System.out.println("the range of Automorphic numbers from 1 to 1000 is :  ");
        for(int num=1;num<=1000;num++)
        {
            int square=num * num;
            int temp=num;
        while(temp>0)
        {
            if(square%10!=temp%10)
            {
                break;
            }
            square /= 10;
            temp /= 10;
        }
        if(temp==0)
        {
            System.out.println(num + " ");
        }
        }
    }
}