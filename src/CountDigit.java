import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        int count = 0;
        int temp = Math.abs(number);  // Make number positive if it's negative

        if (temp == 0) {
            count = 1;  // If the number is 0, it has one digit
        } else {
            while (temp > 0) {
                temp /= 10;  // Remove the last digit of the number
                count++;     // Increment count for each digit
            }
        }
        
        System.out.println("Number of digits: " + count);
        
        scanner.close();
    }
}