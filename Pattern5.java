package advanceLoop;
import java.util.Scanner;
public class Pattern5 {

	public static void main(String[] args) {
		
		//Triangle loop
		
		System.out.print("Enter a number: ");
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=n-i+1; j++) {
				System.out.print("* ");
			}
			for(int j=1; j<=i-1; j++) {
				System.out.print("  ");
			}
			System.out.println();
		}

	}

}
