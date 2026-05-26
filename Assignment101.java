package module2programs;

class C1 
{
	C1()
	{
		System.out.println("Non parameterized Parent class constructor");
	}
	C1(int a)
	{
		this();
		System.out.println("Parameterized Parent class constructor");
	}
}

public class Assignment101 extends C1
{
	Assignment101()
	{
		super(10);
		System.out.println("Child class constructor");
	}

	public static void main(String[] args) 
	{
		new Assignment101();
	}
}