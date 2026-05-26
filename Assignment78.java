package module2programs;
class multi
{
	static void method2()
	{
		System.out.println("Parent class");
	}
}

class multi1 extends multi
{
	static void method1()
	{
		method2();
		System.out.println("Parent 1 class");
	}
}

public class Assignment78 extends multi1
{
	public static void main(String[] args) 
	{
		method1();
	}
}