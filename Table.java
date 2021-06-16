package loops;
import java.util.Scanner;	
public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

     Scanner sd=new Scanner(System.in);
		int d=sd.nextInt();
		for(int u=1; u<=10; u++) {
			System.out.println(d+" X "+u+" = "+u*d);
		}
		

	}

}
