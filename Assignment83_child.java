package module2programs;

class paren1 
{
	paren1()
	{
		System.out.println("Parent class constructor");
	}
}

public class Assignment83_child extends paren1
{
	Assignment83_child()
	{
		super();
		System.out.println("Child class constructor");
	}

	public static void main(String[] args) 
	{
		new Assignment83_child();
	}
}