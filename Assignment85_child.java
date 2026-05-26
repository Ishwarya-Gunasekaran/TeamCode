package module2programs;

class paren3 
{
	paren3()
	{
		System.out.println("Parent class constructor");
	}
}
class child1 extends paren3
{
	child1()
	{
		super();
		System.out.println("Child class constructor - 1");
	}
}

public class Assignment85_child extends child1
{
	Assignment85_child()
	{
		super();
		System.out.println("Child class constructor - 2");
	}

	public static void main(String[] args) 
	{
		new Assignment85_child();
	}
}