package module2programs;

class P6 
{
	P6()
	{
		System.out.println("Non parameterized Parent class constructor");
	}
	P6(int a)
	{
		System.out.println("Parameterized Parent class constructor");
	}
}

public class Assignment94 extends P6
{
	Assignment94()
	{
		super();
		System.out.println("Child class constructor");
	}

	public static void main(String[] args) 
	{
		new Assignment94();
	}
}