package module2programs;

public class Assignment110 
{
	public void method1()
	{
		System.out.println("Public method");
	}
	private void method2()
	{
		System.out.println("Private method");
	}
	protected void method3()
	{
		System.out.println("Protected method");
	}
	void method4()
	{
		System.out.println("Default method");
	}
	public static void main(String[] args) 
	{
		Assignment110 a1= new Assignment110();
		a1.method1();
		a1.method2();
		a1.method3();
		a1.method4();
	}
}