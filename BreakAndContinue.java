package codeWithMe;

public class BreakAndContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		for (int i=0; i<6; i++) {
//			System.out.println(i);
//			System.out.println("Java is great");
//			
//			if(i==3) {
//				System.out.println("Ending the loop");
//				break;
//			}
//		}
//		int i =0;
//		while(i<6) {
//			System.out.println(i);
//			System.out.println("Java is great");
//			if(i==3) {
//				System.out.println("Ending the loop");
//				break;
//			}
//			i++;
//		}
		int i=0;
		do {
			System.out.println(i);
			System.out.println("Java is great");
			if(i==2) {
				System.out.println("Ending the loop");
				break;
			}
			i++;
			
		} while(i<5);
		System.out.println("Loop ends here");
		
		
	}

}
