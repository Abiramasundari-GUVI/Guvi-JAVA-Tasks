import java.util.Scanner;
public class PrintLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Please Enter String : ");
		String msg =sc.nextLine();
		int length ;
		
		length = msg.length();
		System.out.println("Length of Given String is "+length);
		sc.close();
	}

}
