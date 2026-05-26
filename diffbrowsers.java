package module2programs;
import java.util.Scanner;
public class diffbrowsers 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Which browser do you need?" );
		int sel = s1.nextInt();
		switch(sel)
		{
		case 1 : 
			System.out.println("System is launching Chrome browser");
			break;
		case 2 :
			System.out.println("System is launching Edge browser");
			break;
		case 3 :
			System.out.println("System is launching Firefox browser");
			break;
		case 4 :
			System.out.println("System is launching Safari browser");
			break;
		default:
			System.out.println("Invalid selection");
			break;
		}
		s1.close();
	}
}