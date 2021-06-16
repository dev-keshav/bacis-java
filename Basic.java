package methods;

public class Basic {
	static int logic(int x, int y) {
		
		int z;
		
		
		if(x>y) {
			z=(x+y)*3;
		}
		else {
			z=(x-y)*4;
		}
		return z;
		
	}

	public static void main(String[] args) {
		
		int a=5;
		int b=4;
		int c;
		
			c=logic(a,b);	
		
		int a1=45;
		int b1=6;
		int c1;
		
		c1=logic(a1,b1);
		
		
		System.out.println(c);
		System.out.println(c1);
		
	}

}
