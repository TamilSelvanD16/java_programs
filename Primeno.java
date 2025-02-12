import java.util.Scanner;

class Primeno {
    public static void main(String args[]) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = n.nextInt();
        if (x <= 1) {
            System.out.println(x + " is not a prime number");
        } else {
            boolean isPrime = true;
            
            
            for (int i = 2; i <= Math.sqrt(x); i++) {
                if (x % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) {
                System.out.println(x + " is a prime number");
            } else {
                System.out.println(x + " is not a prime number");
            }
        }
    }
}
