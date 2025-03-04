import java.util.*;
class ReverseStrings
{
    public static void main(String A[])
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the Value :");
        String str=in.nextLine();
        String reversed="";
        String[] word=str.trim().split("\\s+");
        for(int i=word.length-1;i>=0;i--)
        {
            
            reversed+=word[i];
            reversed+=" ";
        }
        System.out.println(reversed);
    }
}
/*
Enter the Value :I   Love   Java   Programming
Programming Java Love I 
*/