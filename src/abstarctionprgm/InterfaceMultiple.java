package abstarctionprgm;

interface Bikedetails
{
	abstract public void color();
	abstract public void speed();
}

interface vehicle  {
	abstract public void model();
	
}
class Yamaha implements Bikedetails,vehicle //multiple I nheritance
{

	@Override
	public void model() {

         System.out.println("Modelmethod");
		
	}

	@Override
	public void color() {
		System.out.println("Color method");
		
	}

	@Override
	public void speed() {
		System.out.println("Speed Method");
		
	}
	
}
public class InterfaceMultiple {

	public static void main(String[] args) {
		Yamaha obj=new Yamaha();
		obj.color();
		obj.model();
		obj.speed();

	}

}
