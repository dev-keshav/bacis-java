package myfirst;
import java.util.Scanner;
public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter number between 1 and 100\n");
	        int N = scanner.nextInt();
	        if(N%2!=0)
	        {
	            System.out.println("Weid");
	        }
	        else if(N>=2 && N<=5)
	        { System.out.println("Not Weid");
	        
	        }
	        else if(N>=6 && N<=20)
	        { System.out.println("Weid");	
	        
	        }
	        else if(N>20)
	        { System.out.println("Not Weid");
	        
	        }
	        
	        
	}

}
