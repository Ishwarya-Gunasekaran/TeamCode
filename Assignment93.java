package module2programs;

class P5 
{
	P5()
	{
		System.out.println("Parent class constructor");
	}
}

public class Assignment93 extends P5
{
	Assignment93()
	{
		System.out.println("Child class constructor");
	}

	public static void main(String[] args) 
	{
		new Assignment93();
	}
}