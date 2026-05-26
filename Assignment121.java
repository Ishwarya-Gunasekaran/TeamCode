package module2programs;

class cats
{
	final void sound()
	{
		System.out.println("Cats meow");
	}
}

class horse extends cats
{
	//not able to override sound();
}

public class Assignment121
{
	public static void main(String[] args) 
	{
		horse a=new horse();
		a.sound();
	}
}