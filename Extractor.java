import java.util.Scanner;

public class Extractor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the original string: ");
        String input = in.nextLine();
        StringBuilder builder = new StringBuilder(input);
        StringBuffer buffer = new StringBuffer(input);
        System.out.print("Enter the starting index: ");
        int start = in.nextInt();
        System.out.print("Enter the ending index: ");
        int end = in.nextInt();
        if(start>=0 && end<=input.length() && start<end)
        {
            String fromBuilder = builder.substring(start, end);
            String fromBuffer = buffer.substring(start, end);
            System.out.println("\nExtracted Substring from StringBuilder: " + fromBuilder);
            System.out.println("Extracted Substring from StringBuffer: " + fromBuffer);
        } 
        else 
        {
            System.out.println("Invalid");
        }
    }
}
/*
Enter the original string: Avengers Assemble   
Enter the starting index: 0
Enter the ending index: 8

Extracted Substring from StringBuilder: Avengers
Extracted Substring from StringBuffer: Avengers
*/
