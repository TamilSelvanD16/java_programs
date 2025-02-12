class Max
{
    public static void main(String args[])
    {
        int a,b,c;
        a=94;
        b=45;
        c=18;
        //short_circuit_operator
        System.out.println("A is greatest : " + (a>b && a> c));
        System.out.println("B is greatest : " + (b>a && b>c));
        System.out.println("C is greatest : " + (c>a || c<b));
        //Non_short_operator
        System.out.println("A is greatest : " + (a>b & a> c));
        System.out.println("B is greatest : " + (b>a & b>c));
        System.out.println("C is greatest : " + (c<a | c>b));
        
    }
}