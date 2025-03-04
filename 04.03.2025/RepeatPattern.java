import java.util.*;
class RepeatPattern
{
    public static void main(String args[]) 
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter Value : ");
        String str=in.nextLine();
        String result = "";
        String temp = ""; 
        for (int i = 0; i < str.length(); i++) 
        {
            char a = str.charAt(i);
            if (Character.isLetter(a))
            {
                temp += a; 
            }
            else if (Character.isDigit(a)) 
            {
                int t = a - '0';
                for (int j = 0; j < t; j++)
                {
                    result += temp; 
                }
                temp = ""; 
            }
        }
        // result += temp; 
        System.out.println(result);
    }
}
