package module2programs;

class A1 
{
	public void method1()
	{
		System.out.println("Public method");
	}
	
	protected void method2()
	{
		System.out.println("Protected method");
	}
	
	void method3()
	{
		System.out.println("Default method");
	}
}

public class Assignment111
{
	public static void main(String[] args) 
	{
		A1 obj=new A1();
		obj.method1(); 
		obj.method2();
		obj.method3();
	}
}