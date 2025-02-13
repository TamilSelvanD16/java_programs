import java.util.Scanner;
public class Armstrongnum
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = in.nextInt();
        int count = num;
        int Sum = 0;
        
        while (num > 0) {
            int digit = num % 10;
            Sum = Sum + (digit * digit * digit);
            num /= 10;
        }
        
        if (Sum == count)
            System.out.println(count + " is an Armstrong number");
        else
            System.out.println(count + " is not an Armstrong number");
    }
} 