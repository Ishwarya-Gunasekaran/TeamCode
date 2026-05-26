package module2programs;

public class Assignment96 
{
	
	Assignment96()
	{
		this(20);
		System.out.println("No parameterized constructor");
	}
	
	Assignment96(int a)
	{
		this(10,20);
		System.out.println("Single Parameterized constructor");
	}
	
	Assignment96(int a,int b)
	{
		System.out.println("Double Parameterized constructor");
	}
	
	public static void main(String[] args) 
	{
		new Assignment96();
	}
}