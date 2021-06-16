package codeWithMe;
import java.util.Scanner;
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Q.5 Write a program to find out the type of website from the URL.
		//  .com -> Commerical website
		//  .in  -> Indian website
		//  .org -> organizational website
		
		Scanner sc= new Scanner(System.in);
		String a;
		System.out.println("Enter a type of site");
		a=sc.next();
		if(a.endsWith(".org")) {
			System.out.println("This is an organizational website");
		}
		else if(a.endsWith(".com")){
			System.out.println("This is an commerical website");
		}
		else if(a.endsWith(".in")){
			System.out.println("This is an indian website");
		}
		else {
			System.out.println("Invalid");
		}
		
	}

}
