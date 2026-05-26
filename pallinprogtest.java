package module2programs;

public class pallinprogtest 
{
	public static void main(String[] args) 
	{
		String input="madam";
		String output="";
		for(int i=input.length()-1;i>=0;i--)
		{
			char a=input.charAt(i);
			output=output+a;
		}
		
		System.out.println(output);
		
		if(input.equals(output))
		{
			System.out.println("It is pallindrome");
		}
		else
		{
			System.out.println("Not a pallindrome"); 
		}
	}
}