package module2programs;
import java.util.Scanner;
public class genderprogram 
{
	public static void main(String[] args) 
	{		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the Gender (male/female) : ");
		String gender = s1.next();		
		System.out.println("Enter Your Age : ");
		int age = s1.nextInt();
		if((age>=0)&&(age<=5))
		{
			System.out.println("Congrats! You can avail free travel service");
		}
		else if((age>=5)&&(age<=10))
		{
			System.out.println("Congrats! You can avail 10% discount");
		}
		else if(gender.equalsIgnoreCase("female"))
		{
			System.out.println("Do you have Aadhaar card with you : ");
			String response = s1.next();
			if(response.contains("yes"))
			{
				System.out.println("Congrats! You can avail free travel service");
			}
			else
			{
				System.out.println("Please pay full price");
			}
		}
		else if(gender.equalsIgnoreCase("male"))
		{
			if(age>=60)
			{
				System.out.println("Congrats! You can avail 50% discount");
			}
			else
			{
				System.out.println("Please pay full price");
			}
		}s1.close();
	}
}