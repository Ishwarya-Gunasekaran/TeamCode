package module2programs;

class animals
{
	void sound()
	{
		System.out.println("Animals bark");
	}
}

class dog extends animals
{
	void sound()
	{
		System.out.println("Dogs bark");
	}
}

public class Assignment118
{
	public static void main(String[] args) 
	{
		animals a=new animals();
		a.sound();
	}
}