package module2programs;

import java.util.Arrays;

public class anagramprog 
{
	public static void main(String[] args) 
	{
		String a="tea";
		String b="ate";
		if(a.length()!=b.length())
		{
			System.out.println("Not an anagram");
		}
		else
		{
			char [] c1 = a.toCharArray();
			char [] c2 = b.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			if(Arrays.equals(c1, c2))
			{
				System.out.println("Yes they are anagram");
			}
			else
			{
				System.out.println("No they are not anagram");
			}
		}
	}
}