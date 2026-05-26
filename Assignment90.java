package module2programs;
class P3
{
	P3()
	{
		System.out.println("Parent class constructor");
	}
}

class P4 extends P3
{
	P4()
	{
		System.out.println("Non-parameterized child 1 constructor");
	}
	
	P4(int a)
	{
		this();
		System.out.println("Parameterized child 1 constructor");
	}
}

public class Assignment90 extends P4
{
	Assignment90()
	{
		System.out.println("Non-parameterized child 2 constructor");
	}
	
	Assignment90(int a)
	{
		this();
		System.out.println("Parameterized child 2 constructor");
	}
	
	public static void main(String[] args) 
	{
		new Assignment90(10);
	}
}