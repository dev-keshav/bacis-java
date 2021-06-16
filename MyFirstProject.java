package myfirst;


public class MyFirstProject {

	public static void main(String[] args) {
		
//      int x=5, y=4, z;
//      z=2*x++ +3*++y;
//      System.out.println(z);
      
    		  byte a= 5, y;
    		  y= a++;
    		  System.out.println(a+" "+y);
    		  String str1="Java Program";
    		  System.out.println(str1);
    		  String str2="JAVA";
    		  System.out.println(str2);
 
    		char c[]= {'h','e','l','l','o'};
    		String str3=new String(c,1,3);
    	System.out.println(str3);
    	
    	byte b[]= {65,66,67,68,};
    	String str4=new String(b,1,2);
    	System.out.println(str4);
    	
    	String f="amdslk sdks";
    	System.out.println(f.length());
    	
    	String str5="Keshav";
    	//String str6="Keshav";
    	String str6=new String("Keshav");
    	System.out.println(str5==str6);
    	
		
	}

}

