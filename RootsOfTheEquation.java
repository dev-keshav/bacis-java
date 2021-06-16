package mathsFormulaProgramms;
import java .util.Scanner;
public class RootsOfTheEquation {

	public static void main(String[] args) {
		Scanner Sc=new Scanner (System.in);
		System.out.println("Enter The Coefficient of X Square");
		int a=Sc.nextInt();
		System.out.println("Enter The Coeffient Of X");
		int b=Sc.nextInt();
		System.out.println("Enter The Constant Term");
		int c=Sc.nextInt();
		
	    double root1=(-b+Math.sqrt(b*b-4*a*c))/2*a;
	    
	    double root2=(-b-Math.sqrt(b*b-4*a*c))/2*a;
	    System.out.println("Your Roots Of The Equation Are "+root1+" and"+ root2);
		
		
	}

}
