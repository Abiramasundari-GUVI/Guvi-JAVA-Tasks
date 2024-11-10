import java.util.Scanner;

public class AlphabetPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 'y' to print characters from A to Z: ");
        String input = scanner.nextLine();
        
        //Action for print 
        if (input.equalsIgnoreCase("y")) {
            for (char c = 'A'; c <= 'Z'; c++) {
            	
            	// Print value with space
                System.out.print(c + " ");
            }
        } else {
            System.out.println("Program terminated.");
        }
        
        scanner.close();
    }
}
