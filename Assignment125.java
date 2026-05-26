package module2programs;

interface vehicle
{
	abstract void method1();
}

class car implements vehicle
{
	public void method1() 
	{
		System.out.println("Real logic 1");
	}
}

class bike extends car
{
	public void method2() 
	{
		System.out.println("Real logic 2");
	}
}

public class Assignment125
{
	public static void main(String[] args) 
	{
		bike c1=new bike();
		c1.method1();
		c1.method2();
	}
}