package module2programs;

public class switchconcept 
{
	public static void main(String[] args) 
	{
		int sel = 2;
		switch(sel)
		{
		case 1 : 
			System.out.println("User selects option 1");
			break;
		case 2 :
			System.out.println("User selects option 2");
			break;
		default:
			System.out.println("No option selected");
			break;
		}
	}
}