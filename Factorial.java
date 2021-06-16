package loops;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.out.println("Enter a number");
    	
    	Scanner sc=new Scanner(System.in);
    	
      int n=sc.nextInt();
      long factorial=1;
      for(int i=1; i<=n; i++)
      {
    	  factorial=factorial*i;
      }
               System.out.println("Factorial of "+n+" is " +factorial);
               
	}

}
