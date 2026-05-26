package module2programs;
public class Assignment81_Vehicle
{
	void common()
	{
		System.out.println("Vehicle has some common features : ");	
	}
	
	public static void main(String[] args) 
	{
		Car obj = new Car();
		obj.common();
		obj.carcommon();
		
		Bike obj1 = new Bike();
		obj1.common();
		obj1.bikecommon();
	}
}
class Car extends Assignment81_Vehicle
{
	void carcommon()
	{
	System.out.println("Car's common features : 4 wheels, AC, break, engine and fuel system");
	}
}
class Bike extends Assignment81_Vehicle
{
	void bikecommon()
	{
	System.out.println("Bike's common features : 2 wheels, engine and fuel system");
	}
}