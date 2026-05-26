package module2programs;
import java.util.Scanner;
public class salaryExperience 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the salary : ");
		int sal = s1.nextInt();
		System.out.println("Enter the experience : ");
		int exp = s1.nextInt();
		if(sal>=50000)
		{
			if(exp>5)
			{
				System.out.println("Congrats! You are selectected for bonus payout!!");
			}
			else
			{
				System.out.println("Sorry! You are not eligible for bonus payout!");
			}
		}
		else
		{
			System.out.println("Sorry! You dont have the eligible salary");
		} 
		s1.close();
	}
}