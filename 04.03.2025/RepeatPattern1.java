import java.util.*;
class RepeatPattern1
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
            if((a>='A' && a<='Z')||(a>='a'&& a<='z'))
            {
                temp += a; 
            }
            else if(a>='0' && a<='9') 
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
