package module2programs;
import java.util.Scanner;
public class Dayofweek 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the choice of a day in a week : ");
		int day = s1.nextInt();
		switch(day)
		{
		case 1 : 
			System.out.println("Sunday");
			break;
		case 2 :
			System.out.println("Monday");
			break;
		case 3 :
			System.out.println("Tuesday");
			break;
		case 4 :
			System.out.println("Wednesday");
			break;
		case 5 :
			System.out.println("Thursday");
			break;
		case 6 :
			System.out.println("Friday");
			break;
		case 7 :
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Invalid selection");
			break;
		}	s1.close();
	}
}