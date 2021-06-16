package array;

public class SumOfMatrix {

	public static void main(String[] args) {
		
		int a[][]= { {24, 45, 63, 32},{62, 41, 86, 61},{35, 93, 10, 34},{23, 54, 68, 22} };

		// Printing the matix.
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(a[i][j]+" ");
			}
				System.out.println();
		}
		System.out.println();
		
		// Sum of matrix
		for(int i=0; i<4; i++){
			int sum=0;
			for(int j=0; j<4; j++) {
				sum=sum+a[i][j];
			}
				System.out.println("Sum of the row "+(i+1)+" is: "+sum);
				
			}
		
	}

}
