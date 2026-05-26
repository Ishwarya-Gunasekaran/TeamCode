package module2programs;
class Employee2
{
	static int basesal = 10000;
}

class Salary extends Employee2
{
	static int hra = 5000;
	static int da = 3000;	
}

public class Assignment80_Bonus extends Salary
{
	static int bonus = 2000;
	public static void main(String[] args) 
	{
		int totalsalary = basesal+hra+da;	
		System.out.println("Salary of person including bonus :" +totalsalary);
	}
}