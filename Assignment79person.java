package module2programs;
class Manager
{
	static void method2()
	{
		System.out.println("Manager decides");
	}
}

class Employee extends Manager
{
	static void method1()
	{
		method2();
		System.out.println("Employee asks Manager");
	}
}

public class Assignment79person extends Employee
{
	public static void main(String[] args) 
	{
		method1();
		System.out.println("Person asks Employee");
	}
}