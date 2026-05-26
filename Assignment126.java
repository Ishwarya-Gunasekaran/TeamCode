package module2programs;

interface demo
{
	abstract void show();
}

abstract class subject1 implements demo
{
	abstract void display();
}

class subject2 extends subject1
{
	public void show() 
	{
		System.out.println("Real logic 1");
	}
	
	public void display() 
	{
		System.out.println("Real logic 2");
	}
}

public class Assignment126
{
	public static void main(String[] args) 
	{
		subject2 a1=new subject2();
		a1.show();
		a1.display();
	}
}