package codeWithMe;
import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mate;
		System.out.println("Enter your name");
		Scanner sc=new Scanner(System.in);
		mate= sc.nextInt();
		
		switch(mate) {
		case 5:
			System.out.println("You are tenager");
			break;
		case 18:
			System.out.println("You are mature");
			break;
		case 23:
			System.out.println("Get a Job");
			break;
		case 35:
			System.out.println("Fuck Life");
			break;
		case 60:
			System.out.println("Now you are old");
			
		}
		
//		Scanner sc = new Scanner(System.in);
//		int age=32;
//
//        if(age>60){
//            System.out.println("You are old");
//        }
//        else if(age>45){
//            System.out.println("under Experence");
//        }
//        else if(age>35) {
//            System.out.println("Good Boy");
//        }
//        else if(age>18){
//            System.out.println("You are mature");
//        }
//        else{
//            System.out.println("You are teenager");
//
//        }

	}

}
