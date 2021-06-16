package advanceLoop;

import java.util.Scanner;

public class Patter2 {

	public static void main(String[] args) {
		// Triangle loop

		System.out.print("Enter a number: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int j=1; j<=a; j++) {
		    for(int i=1; i<=j; i++) {
			   System.out.print("* ");
		    }
		System.out.println();
		}
		
	}

}
