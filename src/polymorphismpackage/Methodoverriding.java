package polymorphismpackage;
class Parent
{
	public void qualification()
	{
		System.out.println("BCA");
		
	}
}
 class Child extends Parent
 {
    // right click -source-override or implementation methods
	 
	@Override 
	 
	  public void qualification() {
		
		System.out.println("BTech");
		
        super.qualification();   //calling immediate parent class method 
		
	}
	 
 }

    public class Methodoverriding {

	public static void main(String[] args) {
		Child childobj=new Child();
		childobj.qualification();
		
		
		//Parent childobj1 = new Parent();
		//childobj1.qualification();
		
		
		

	}

}
