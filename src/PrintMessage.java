import java.util.Scanner;

public class PrintMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of times to print the message (suggested: 10): ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Welcome to GUVI");
        }

        scanner.close();
    }
}