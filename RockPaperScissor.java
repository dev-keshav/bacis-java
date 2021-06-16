package codeWithMe;
import java.util.Random;
import java.util.Scanner;
public class RockPaperScissor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a number 1-3");
//		System.out.println("1");
//		System.out.println("2");
//		System.out.println("3");
		
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		
		Random rand=new Random();
		int a=rand.nextInt(4);
		System.out.println(a);
		
		if(a==b) {
			System.out.println("You are winner");
		}
		else if(a!=b) {
			System.out.println("You are looser");
		}
	}

}
