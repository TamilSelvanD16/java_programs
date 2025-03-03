public class AddinglongString
{
    public static void main(String t[])
    {
        String num1="9999999999999";
        String num2="4444444444";
        
        StringBuilder sb=new StringBuilder();
        int i=num1.length()-1,j=num2.length()-1,carry=0;
        
        while(i>=0 || j>=0 || carry>0)
        {
            int d1=(i>=0) ? num1.charAt(i) - '0' : 0;
            int d2=(j>=0) ? num2.charAt(j) - '0' : 0;
            
            int sum=d1+d2+carry;
            carry=sum/10;
            sb.append(sum % 10);
            
            i--;
            j--;
            System.out.println(sb);
        }
        System.out.println("Sum of Strings : " + sb.reverse().toString());
    }
}