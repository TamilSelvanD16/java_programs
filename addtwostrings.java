class addtwostrings
{
    public static void main(String args[])
    {
        String a="9,9,9,8,8,8,7,7,7,6,6,6,5,5,5,4,4,4,3,3,3,2,2,2,1,1,1";
        String b="9,9,9,8,8,8,7,7,7,6,6,6,5,5,5,4,4,4,3,3,3,2,2,2,1,1,1";
        int numA=0;
        int numB=0;
        String[] a1=a.split(",");
        String[] b1=b.split(",");
        for(int i=0;i<a1.length;i++)
        {
             numA+=Integer.parseInt(a1[i]);
             numB+=Integer.parseInt(b1[i]);
        }
        System.out.println(numA+numB);
    }
}

    
      

