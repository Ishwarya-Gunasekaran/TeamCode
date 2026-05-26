package module2programs;

abstract class parent5
{
	abstract void method1();
}

class child6 extends parent5
{
	void method1() 
	{
		System.out.println("Real logic");
	}
}

public class Assignment122
{
	public static void main(String[] args) 
	{
		child6 c1=new child6();
		c1.method1();
	}
}