package module2programs;
import java.util.Scanner;
public class mathAndScience 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Your Math mark : ");
		int mathmark = s1.nextInt();
		System.out.println("Enter Your Science mark : ");
		int scimark = s1.nextInt();
		if((mathmark>=90)&&(scimark>=90))
		{
			System.out.println("Grade : A+");
		}
		else if((mathmark>=90)||(scimark>=90))
		{
			System.out.println("Grade : A");
		}
		else if((mathmark>=80)&&(scimark>=90))
		{
			System.out.println("Grade : B+");
		}
		else if((mathmark>=80)&&(scimark<90))
		{
			System.out.println("Grade : B");
		}
		s1.close();
	}
}