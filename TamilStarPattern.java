public class TamilStarPattern {
    public static void main(String[] args) {
        int n = 7; 

        for (int i = 0; i < n; i++) {
            // T
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == n / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("   "); 
            // A
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || (i == 0 && j > 0 && j < n - 1) || (i == n / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");

            // M
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || (j == i && i <= n / 2) || (j == n - i - 1 && i <= n / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");

            // I
            for (int j = 0; j < n; j++) {
                if (j == n / 2 || i == 0 || i == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");

            // L
            for (int j = 0; j < n; j++) {
                if (j == 0 || (i == n - 1 && j < n - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println(); 
        }
    }
}
