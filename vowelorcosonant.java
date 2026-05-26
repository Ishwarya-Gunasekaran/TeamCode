package module2programs;
import java.util.Scanner;
public class vowelorcosonant 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the letter : ");
		char letter = s1.next().charAt(0);
		switch(letter)
		{
		case 'a' : 
			System.out.println("'a' is a Vowel");
			break;
		case 'e' :
			System.out.println("'e' is a Vowel");
			break;
		case 'i' :
			System.out.println("'i' is a Vowel");
			break;
		case 'o' :
			System.out.println("'o' is a Vowel");
			break;
		case 'u' :
			System.out.println("'u' is a Vowel");
			break;
		default:
			System.out.println("this letter is a consonant");
			break;
		}	s1.close();
	}
}