package abstarctionprgm;

interface Bike{
	abstract public void speedlimit();
	public void accelarate();
	
}

class Honda implements Bike
{

	@Override
	public void speedlimit()
	{
		System.out.println("Honda speed limit");
		
	}

	@Override
	public void accelarate() 
	{
	 System .out.println("Honda accelaration");
		
	}
	
}


public class Interfacepgm
{
	public static void main(String[] args) {
		//normal way of calling methods
		Honda ob=new Honda();
		ob.speedlimit();
		ob.accelarate();
		
		//creating object using interface refernce
		
		Bike obj=new Honda();
		obj.speedlimit();
		obj.accelarate();
		
				
	}
}















