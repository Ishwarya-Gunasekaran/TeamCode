package module2programs;

class animal
{
	static void diff()
	{
		System.out.println("Animals are of different types");
	}
}
class dogs extends animal
{
	static void dog()
	{
		diff();
		System.out.println("Dog is a domestic animal");
	}
}
class lions extends animal
{
	static void lion()
	{
		diff();
		System.out.println("Lion is a wild animal");
	}
}
public class Assignment87
{
	public static void main(String[] args) 
	{
		dogs.dog();
		lions.lion();
	}
}