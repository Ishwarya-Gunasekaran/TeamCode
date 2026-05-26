package module2programs;

public class Assignment120
{
	int empID;
	
	void login(int employeeID)
	{
		this.empID=employeeID;
		System.out.println(empID);
	}
	
	public static void main(String[] args) 
	{
		Assignment120 a=new Assignment120();
		a.login(500);
	}
}