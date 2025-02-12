class Bitwise
{
    public static void main(String args[])
    {
        int a,b,c,d,e;
        a=492;
        b=333;
        System.out.println("integer a to binary :" +Integer.toBinaryString(a));
        System.out.println("integer b to binary :" +Integer.toBinaryString(b));
        c=a&b;
        d=a|b;
        e=a^b;
        System.out.println("AND operator :" + c);
        System.out.println("OR operator :" + d);
        System.out.println("EX-OR operator :" + e);
    
    }
}
/*integer a to binary :111101100
integer b to binary :101001101
AND operator :332
OR operator :493
EX-OR operator :161*/