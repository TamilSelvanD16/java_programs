class increment
{
    public static void main(String args[])
    {
        int x=10,y,z,a;
        y=--x + x++ + ++x + --x + x++;
        System.out.println("Increment of x in y:" + y);
        x =10;
        z=x++ + ++x + ++x + x++ + ++x;
        System.out.println("Increment of x in z:" + z);
        x=10;
        a= --x + --x + --x + --x;
        System.out.println("Increment of x in a:" + a);
    }
}
/*
Increment of x in y:49
Increment of x in z:63
Increment of x in a:30
*/