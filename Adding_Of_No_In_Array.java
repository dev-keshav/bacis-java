package array;

public class Adding_Of_No_In_Array {

	public static void main(String[] args) {
		
		// Finding the sum of all elements in array
		
		int A[]= {45, 55, 75, 68, 21, 41};
	    int sum=0;
	    
	    int i;
	    for(i=0; i<A.length; i++)
	    {
	        sum=sum+A[i];
	        
	    }
	    System.out.println("Sum of all elements in array: "+"'"+sum+"'");

	}

}
