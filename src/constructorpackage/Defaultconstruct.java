package constructorpackage;

public class Defaultconstruct {
	int age;    //instance variable
	String name; //instance variable


	public static void main(String[] args)
	{
		
    Defaultconstruct obj=new Defaultconstruct();  //() it is default constructor without parameter
    obj.display();
 }
	
  public void  display() {
	  
	  System.out.println("Age: " +age);
	  System.out.println("Name :" +name);
	  

}
}

