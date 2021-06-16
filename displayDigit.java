package loops;
import java.util.Scanner;
public class displayDigit {

	public static void main(String[] args) {

	//	This is the method to display the digits of the number.
		
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int n;
		
		while(a>0) {
			n=a%10;
			a=a/10;
			System.out.println(n);
			
		}
		
		
	}

}
