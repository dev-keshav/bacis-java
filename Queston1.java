package codeWithMe;

import java.util.Scanner;

public class Queston1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Q.1 Write a program to find out whether a student is pass or fail, if it requires total 40%
				//and at least 33% in each subject to pass. Assume 3 subjects and take marks as an inout from the user'
			
				Scanner sc= new Scanner(System.in);
				byte s1, s2, s3;
				
				System.out.println("Enter your Physics marks");
				s1=sc.nextByte();
				System.out.println("Enter your Chemistry marks");
				s2=sc.nextByte();
				System.out.println("Enter your Maths marks");
				s3=sc.nextByte();
				float avg=(s1+s2+s3)/3.0f;
				if(avg>=40 && s1>=33 && s2>=33 && s3>=33) {
					System.out.println("You are pass");
				}
				else {
					System.out.println("Try next time");
				}
	}

}
