package module2programs;

class paren 
{
	paren()
	{
		System.out.println("Parent class constructor");
	}
}

public class Assignment82_child extends paren
{
	Assignment82_child()
	{
		System.out.println("Child class constructor");
	}
	
	public static void main(String[] args) 
	{
		new Assignment82_child();
	}
}