package module2programs;

class P2
{	
	P2(int a)
	{
		System.out.println("Parameterized Parent class constructor");
	}
}

public class Assignment89 extends P2
{
	
	Assignment89(int a)
	{
		super(18);
		System.out.println("Child class constructor");
	}

	public static void main(String[] args) 
	{
		new Assignment89(20);
	}
}