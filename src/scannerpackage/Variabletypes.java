package scannerpackage;


public class Variabletypes 
{
		int a;
		int b=5; //a and b are instance variable
		static int c =10; // This is static variable
		
    public void display()
    
   {
	System.out.println("The value of a ="+a);
	System.out.println("The value of b="+b);
	System.out.println("The value of c="+c);
	 
	int x=15; //local variable
	System.out.println("The value of x="+x);
   }
	
	
	public static void main(String[] args) 
	{
		Variabletypes obj =new Variabletypes(); // object declaration
		obj.a=2; //assigning value to instance variable
		obj.display(); // calling method using object
		
		System.out.println("The value os instance variable="+obj.a); //calling instance variable with the help of object
		
		System.out.println("The value of static  variable="+c);
		//System.out.println(obj.x); //x is local variable we cannot call it outside display method

	}

}
