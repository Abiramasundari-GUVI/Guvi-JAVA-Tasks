import java.util.Scanner;
public class OddOrEven {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int number = sc.nextInt();
		
		if(number % 2 == 0) {
			System.out.println("Given Number is Even");
		}
		else {
			System.out.println("Given Number is Odd");
		}
		
		sc.close();
	}

}
