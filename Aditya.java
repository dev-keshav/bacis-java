package whass_up_bro;
class Calc
{
	int a;
	int b;
	public void perform()
	{
		a = b*3;
	}
}
public class Aditya {

	public static void main(String[] args) {

		Calc obj = new Calc();
		obj.a = 4;
		obj.b = 1;
		
		System.out.println(obj.a);
	}

}
