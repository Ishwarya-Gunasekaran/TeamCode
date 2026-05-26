package module2programs;

public class Assignment114 
{
	public Assignment114(int a, int b)
	{
		System.out.println("Public method");
	}
	private Assignment114(double b)
	{
		System.out.println("Private method");
	}
	protected Assignment114(int a)
	{
		System.out.println("Protected method");
	}
	Assignment114()
	{
		System.out.println("Default method");
	}
	public static void main(String[] args) 
	{
		new Assignment114();
		new Assignment114(10);
		new Assignment114(44.60);
		new Assignment114(20,60);
	}
}