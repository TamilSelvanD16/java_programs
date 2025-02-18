import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Enter the digit or number N: ");
        int N = scanner.nextInt();
        

        System.out.print("Enter the number of terms: ");
        int terms = scanner.nextInt();
        scanner.close();
        
        int term = 0; 
        int sum = 0;  
        for (int i = 1; i <= terms; i++) {
            term = term * 10 + N;
            sum += term;
        }
        
        System.out.println("The sum of the series is: " + sum);
    }
}