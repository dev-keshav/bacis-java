package codeWithMe;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Q.4 Write a Java program to find whether a year entered by the user is a leap year or not.
		
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("Enter year");
		a=sc.nextInt();
		if(a%4==0) {
			System.out.println("This is leap year");
		}
		else {
			System.out.println("This not a leap year");
		}
}
}