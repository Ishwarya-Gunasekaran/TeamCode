package module2programs;

public class Assignment102 
{
	public int a = 10;
	private int b = 20;
	protected int c = 30;
	int d = 40;
	
	public static void main(String[] args) 
	{
		Assignment102 a=new Assignment102();
		System.out.println("Public variable :" +a.a);
		System.out.println("Private variable :" +a.b);
		System.out.println("Protected variable :" +a.c);
		System.out.println("Default variable :" +a.d);
	}
}