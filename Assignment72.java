package module2programs;

class parent1
{
	void call()
	{
		System.out.println("Parent1 class");
	}
}

public class Assignment72 extends parent1
{
	public static void main(String[] args) 
	{
		Assignment72 a=new Assignment72();
		a.call();
		System.out.println("Child1 class");
	}
}