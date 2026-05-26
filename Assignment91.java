package module2programs;

public class Assignment91 
{
	
	Assignment91()
	{
		System.out.println("No parameterized constructor");
	}
	
	Assignment91(int a)
	{
		this();
		System.out.println("Parameterized constructor");
	}
	
	
	public static void main(String[] args) 
	{
		new Assignment91(30);
	}
}