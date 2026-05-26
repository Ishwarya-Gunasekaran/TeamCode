package module2programs;
import java.util.Scanner;
public class loginPassorFail 
{
	public static void main(String[] args) 
	{
		String exactusername = "admin";
		String exactpassword = "12345";
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the Username : ");
		String username = s1.next();
		System.out.println("Enter the Password : ");
		String password = s1.next();
		if(username.equals(exactusername))
		{
			if(password.equals(exactpassword))
			{
				System.out.println("Login is success");
			}
			else
			{
				System.out.println("Incorrect password. Login failed");
			}
		}
		else
		{
			System.out.println("Incorrect Username");
		}
		s1.close();
	}
}