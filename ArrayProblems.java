package array;
import java.util.Scanner;
public class ArrayProblems {

	public static void main(String[] args) {
		// 1. create an array of 5 floats and calculate their sum.
		
//		float[] num = {45.4f, 43.5f, 23.5f, 43.55f, 674.6f, 76.90f};
//		float sum=0;
//		for(float a:num) {
//			sum = sum + a;	
//		}
//
//		System.out.println("The Sum of all elements is: "+ sum);
		
		
		
		
		
		// 2. Write a program to find out whether a given integer is present or not.
		
		System.out.print("Enter a number to check: ");
		Scanner sc= new Scanner(System.in);
		
		int [] num= {34, 56, 46, 74, 34};
		int a=sc.nextInt();
		boolean inArray= false;
		for(int element:num) {
			if(a==element) {
				inArray=true;
				break;
			}
		}
		if(inArray) {
			System.out.println("This value is present in array");
			
		}
		else {
			System.out.println("This value is not present in array");
			
		}
	}

}
