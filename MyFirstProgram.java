package myfirst;
import  java.util.Scanner;
public class MyFirstProgram {

	public static void main(String[] args) {
		

		System.out.println("Enter two numbers:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		double c=a+b;
		System.out.println(c);
	}

}
