package inheritancepackage;
class Mobile
{
	public void mobilemethod()
	{
		System.out.println("mobile class method");
	}
}
 
class Samsung  extends Mobile
{
	public void  samsungmethod()
	
	{
		System.out.println("samsungmethod");
	}
}
class  Iphone extends Mobile
{
	public void iphonemethod()
{	
		
System.out.println("iphonemethod");
}

public class Hierachial {

	public static void main(String[] args) {
		Samsung obj = new Samsung();
	    obj.mobilemethod();
	    obj.samsungmethod();

	    Iphone iphone = new Iphone();
	    Mobile iphoneobj = iphone;

	    iphoneobj.mobilemethod();
	    iphone.iphonemethod();
		
			
				

	}

}
}
