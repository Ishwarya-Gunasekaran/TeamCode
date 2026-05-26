package module2programs;

class P7 
{
	P7()
	{
		System.out.println("Parent class constructor");
	}
}

class child5 extends P7
{
	child5()
	{
		super();
		System.out.println("Child class 1 constructor");
	}
}

public class Assignment95 extends child5
{
	Assignment95()
	{
		super();
		System.out.println("Child class 2 constructor");
	}
	
	public static void main(String[] args) 
	{
		new Assignment95();
	}
}