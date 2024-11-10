import java.util.Scanner;

public class SceniorCitizenCheck {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Check if the person is a senior citizen
        if (age >= 60) {
            System.out.println("You are a senior citizen.");
        } else {
            System.out.println("You are not a senior citizen.");
        }

        // Close the scanner
        scanner.close();
    }
}