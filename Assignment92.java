package module2programs;

public class Assignment92 
{
	
	Assignment92()
	{
		this(20);
		System.out.println("No parameterized constructor");
	}
	
	Assignment92(int a)
	{
		System.out.println("Parameterized constructor");
	}
	
	public static void main(String[] args) 
	{
		new Assignment92();
	}
}