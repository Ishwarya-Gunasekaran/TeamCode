package module2programs;

public class Assignment106 
{
	public static void method1()
	{
		System.out.println("Public method");
	}
	private static void method2()
	{
		System.out.println("Private method");
	}
	protected static void method3()
	{
		System.out.println("Protected method");
	}
	static void method4()
	{
		System.out.println("Default method");
	}
	public static void main(String[] args) 
	{
		method1();
		method2();
		method3();
		method4();
	}
}