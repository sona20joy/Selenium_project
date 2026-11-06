package abstarctionprgm;

interface Tvremote
{
	abstract public void Poweon();
	abstract public void Poweroff();
	
}
interface Smarttv extends Tvremote  //Inherit one interface to another
{
	abstract public void Display();
}


class Samsung implements Smarttv{

	@Override
	public void Display() {
		System.out.println("Display method");
	}

	@Override
	public void Poweon() {
		
	System.out.println("Poweron Method");
	
	}

	@Override
	public void Poweroff() {
		System.out.println("Poweroff method");
		
	}
	
}
public class Interfacepgm2 {

	public static void main(String[] args) {
		Samsung obj=new Samsung();
		obj.Display();
		obj.Poweon();
		obj.Poweroff();
		
	}
}

