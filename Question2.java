package codeWithMe;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	//Q1 Calculate income tax paid by an employee to the government as per the slabs mentioned below.
		
		// Income slab        Tax
		// 2.5L-5.0L          5%
		// 5.0-10.0L          20%
		// Above 10.0L        30%
		
		// Note that there is no tax below 2.5L. Take input amount as an input from the user.
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your income in lakh");
		
		float tax= 0;
		float income = sc.nextFloat();
		if(income<=2.5) {
			tax = tax + 0;
		}
		if(income<2.5f && income<=5.0f) {
			tax= 0.05f*(income - 2.5f);
		}
		else if(income>5.0f && income<=10.0f) {
			tax=+ 0.2f*(5.0f-2.5f);
			tax=tax+0.05f*(income-5.0f);
		}
		else if(income>10.0f){
			tax=0.05f*(5.0f-2.5f);
			tax=tax+0.2f*(10.0f-5.0f);
			tax=tax+0.3f*(income-10.0f);
		}
		System.out.println(tax);
		
			}

}
