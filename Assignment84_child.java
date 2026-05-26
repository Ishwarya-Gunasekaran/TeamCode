package module2programs;

class paren2 
{
	paren2()
	{
		System.out.println("Parent class constructor");
	}
}

class child extends paren2
{
	child()
	{
		System.out.println("Child class 1 constructor");
	}
}

public class Assignment84_child extends child
{
	Assignment84_child()
	{
		System.out.println("Child class 2 constructor");
	}
	
	public static void main(String[] args) 
	{
		new Assignment84_child();
	}
}