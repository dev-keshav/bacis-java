package loops;
import java.util.Scanner;
public class squarePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Enter a number: ");
		
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		for(int j=1; j<=a; j++) {
		int i;
		for(i=1; i<=a; i++) {
			System.out.print("*"+" ");
		}
		System.out.println("*");
		}
		
	}

}
