package module2programs;
import java.util.Scanner;
public class validMarks 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the mark : ");
		int mark = s1.nextInt();
		if((mark>=0)&&(mark<100))
		{
			if(mark<25)
			{
				System.out.println("Sorry! You are Failed.Try again.");
			}
			else if((mark>=25)&&(mark<50))
			{
				System.out.println("Your Grade is C");
			}
			else if((mark>=50)&&(mark<75))
			{
				System.out.println("Your Grade is B");
			}
			else if((mark>=75)&&(mark<=100))
			{
				System.out.println("Your Grade is A");
			}
		} s1.close();
	}
}