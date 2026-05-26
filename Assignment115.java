package module2programs;

class A5 
{
	public A5(int a, int b)
	{
		System.out.println("Public method");
	}
	
	protected A5(int a)
	{
		System.out.println("Protected method");
	}
	
	A5()
	{
		System.out.println("Default method");
	}
}

public class Assignment115
{
	public static void main(String[] args) 
	{
		new A5();
		new A5(10);
		new A5(20,60);
	}
}