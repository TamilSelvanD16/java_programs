import java.util.*;
public class Palindrome
{
    public static void UsingString(String str)
    {
    // 1. Using String built-in methods 
    String reversed = ""; 
    for(int i = str.length() - 1;i >= 0;i--)
    {
        reversed += str.charAt(i); 
    }
    if (str.equalsIgnoreCase(reversed))
    {
        System.out.println(str + " is a palindrome (Using String)");
    }
    else 
    {
        System.out.println(str + " is NOT a palindrome (Using String)");
    }
}
    // 2. Using StringBuilder
    public static void UsingStringBuilder(String str) 
    {
        StringBuilder sb = new StringBuilder(str);
        if (sb.toString().equalsIgnoreCase(sb.reverse().toString())) 
        {
            System.out.println(str + " is a palindrome (Using StringBuilder)");
        } 
        else
        {
            System.out.println(str + " is NOT a palindrome (Using StringBuilder)");
        }
    }
    // 3. Using StringBuffer
    public static void UsingStringBuffer(String str) 
    {
        StringBuffer sb = new StringBuffer(str);
        if (sb.toString().equalsIgnoreCase(sb.reverse().toString())) 
        {
            System.out.println(str + " is a palindrome (Using StringBuffer)");
        } else 
        {
            System.out.println(str + " is NOT a palindrome (Using StringBuffer)");
        }
    }
    // 4. Without using built-in methods
    public static void WithoutBuiltin(String str) 
    {
        str = str.toLowerCase();
        int left = 0, right = str.length() - 1;

        while (left < right) 
        {
            if (str.charAt(left) != str.charAt(right)) 
            {
                System.out.println(str + " is NOT a palindrome (Without using built-in methods)");
                return;
            }
            left++;
            right--;
        }
        System.out.println(str + " is a palindrome (Without using built-in methods)");
    }
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Value : ");
        String str=in.nextLine();
        System.out.println("Checking palindrome for: " + str);
        UsingString(str);
        UsingStringBuilder(str);
        UsingStringBuffer(str);
        WithoutBuiltin(str);
    }
}
/*
Enter Value : madam
Checking palindrome for: madam
madam is a palindrome (Using String)
madam is a palindrome (Using StringBuilder)
madam is a palindrome (Using StringBuffer)
madam is a palindrome (Without using built-in methods)
*/
