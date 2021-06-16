package loops;
import java.util.Scanner;
public class factorialOfNumber {

	public static void main(String[] args) {
		
		//This is the method to find factorial of a number.
		
		System.out.println("Enter a number which you want factorial");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double fac=1;
		for(int a=1; a<=n; a++) {
			fac=fac*a;
		}
		System.out.println(fac);

	}

}
