package module2programs;

import java.util.Arrays;

public class anagramtest 
{
	public static void main(String[] args) 
	{
		String input="tea";
		String output="ate";
		if(input.length()!=output.length())
		{
			System.out.println("Cannot be anagram");
		}
		else
		{
			char [] c1=input.toCharArray();
			char [] c2=output.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			if(Arrays.equals(c1,c2))
			{
				System.out.println("It is an anagram");
			}
			else
			{
				System.out.println("Not an anagram");
			}
		}
	}
}