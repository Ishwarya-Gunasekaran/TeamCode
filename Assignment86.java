package module2programs;

class parent2
{
	parent2()
	{
		System.out.println("Parent class constructor");
	}
}
public class Assignment86 extends parent2
{
	Assignment86()
	{
		System.out.println("Non-parameterized child constructor");
	}
	
	Assignment86(int a)
	{
		this();
		System.out.println("Parameterized child constructor");
	}

	public static void main(String[] args) 
	{
		new Assignment86(10);
	}
}