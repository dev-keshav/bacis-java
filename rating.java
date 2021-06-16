package loops;
import java.util.Scanner;
public class rating {

	public static void main(String[] args) {
		
		//This is the program for rating the website.
		
		System.out.println("Enter rating out of 5");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();

		if(a==1 || a==2) {
			System.out.println("Bad rating");
		}
		else if(a==3 || a==4) {
			System.out.println("Average rating");
		}
		else if(a==5) {
			System.out.println("Good rating");
		}
		else {
			System.out.println("You have entered a invalid rating");
		}
	}

}
