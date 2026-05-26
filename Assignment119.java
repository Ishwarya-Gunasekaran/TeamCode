package module2programs;

class method2
{
	void login()
	{
		System.out.println("Login with email ID");
	}
}

public class Assignment119 extends method2
{
	void login()
	{
		super.login();
		System.out.println("Login with mob num");
	}
	
	public static void main(String[] args) 
	{
		Assignment119 a=new Assignment119();
		a.login();
	}
}