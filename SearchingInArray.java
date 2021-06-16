package array;
import java.util.Scanner;
public class SearchingInArray {

	public static void main(String[] args) {
		// Searching an elements in array
		
		System.out.print("Enter a number which you want to search: ");
		Scanner sc=new Scanner(System.in);
		
		int no=sc.nextInt();
		int A[]= {2,4,6,7,8,34,65,23,78,44};
		
		for(int i=0; i<A.length; i++)
		{
			if(no==A[i])
			{
				System.out.println("This number is present at "+"'"+i+"'"+" place from starting");
				System.exit(0);
			}
			
		}
		
		System.out.println("Not found");
		
	}

}
