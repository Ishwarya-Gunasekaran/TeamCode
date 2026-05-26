package module2programs;

class parent
{
	static void call()
	{
		System.out.println("Parent class");
	}
}

public class Assignment71 extends parent
{
		public static void main(String[] args) 
		{
			call();
			System.out.println("MAking changes in class");
		}
}