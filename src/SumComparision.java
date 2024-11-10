import java.util.Scanner;

public class SumComparision {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Declare four integer variables
        int a, b, c, d;
        
        // Prompt the user to enter values for a, b, c, and d
        System.out.print("Enter value for a: ");
        a = scanner.nextInt();
        
        System.out.print("Enter value for b: ");
        b = scanner.nextInt();
        
        System.out.print("Enter value for c: ");
        c = scanner.nextInt();
        
        System.out.print("Enter value for d: ");
        d = scanner.nextInt();
        
        // Check if the sum of a and b is greater than the sum of c and d
        if ((a + b) > (c + d)) {
            System.out.println("The sum of a and b is greater than the sum of c and d.");
        } else {
            System.out.println("The sum of a and b is not greater than the sum of c and d.");
        }
        
        // Close the scanner
        scanner.close();
    }
}