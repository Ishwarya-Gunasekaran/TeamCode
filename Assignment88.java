package module2programs;

class P1
{
	P1()
	{
		System.out.println("Non-parameterized Parent class constructor");
	}
}

public class Assignment88 extends P1
{
	Assignment88()
	{
		super();
		System.out.println("Child class constructor");
	}

	public static void main(String[] args) 
	{
		new Assignment88();
	}
}