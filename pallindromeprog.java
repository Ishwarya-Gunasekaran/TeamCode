package module2programs;

public class pallindromeprog 
{
	public static void main(String[] args) {
	String a= "madam";
	String b="";
	for (int i=a.length()-1;i>=0;i--)
	{
		char c1=a.charAt(i);
		b=b+c1;
	}
		if
		(a.equals(b))
		{
			System.out.println("It is pallindrome");
		}
		else
		{
			System.out.println("Not pallindrome");
		}
	}
}