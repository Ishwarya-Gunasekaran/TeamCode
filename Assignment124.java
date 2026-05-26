package module2programs;

interface parent7
{
	abstract void method1();
	abstract void method2();
}

class child8 implements parent7
{
	public void method1() 
	{
		System.out.println("Real logic 1");
	}
	
	public void method2() 
	{
		System.out.println("Real logic 2");
	}
}

public class Assignment124
{
	public static void main(String[] args) 
	{
		child8 c1=new child8();
		c1.method1();
		c1.method2();
	}
}