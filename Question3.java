package codeWithMe;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Q.1 Write a lava program to find out the day of the week given the number[1 for Monday,
		// 2 for Tuesday....and so on]
		
//		Scanner sc= new Scanner(System.in);
//		int day= sc.nextInt(); 
//		switch(day) {
//		case 1 -> System.out.println("Monday");
//		case 2 -> System.out.println("Tuesday");
//		case 3 -> System.out.println("Wednesday");
//		case 4 -> System.out.println("Thursday");
//		case 5 -> System.out.println("Friday");
//		case 6 -> System.out.println("Saturday");
//		case 7 -> System.out.println("Sunday");
//		}
		
		int day;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the day between 1-7");
		day = sc.nextInt();
		switch(day){
		case 1: 
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid");
		}
		
	}

}
