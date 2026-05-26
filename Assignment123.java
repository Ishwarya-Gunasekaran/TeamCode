package module2programs;

abstract class parent6
{
	abstract void method1();
	
	void method2()
	{
		System.out.println("Some logic");
	}
}

class child7 extends parent6
{
	void method1() 
	{
		System.out.println("Real logic");
	}
}

public class Assignment123
{
	public static void main(String[] args) 
	{
		child7 c1=new child7();
		c1.method1();
		c1.method2();
	}
}