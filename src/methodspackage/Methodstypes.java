package methodspackage;

public class Methodstypes {

	public static void main(String[] args) {
    Methodstypes obj=new Methodstypes();
    int result = obj.add(2, 5); //to store the result to a variable
    System.out.println("Addition = " +result);
    
    obj.sub(); // calling method sub
    
    obj.multi(10, 5); // calling method and passing parameters
    int value = obj.div(); // calling method div and store the result to  Varialbes.
    System.out.println("division "+ value);
	obj.div();
      //System .out.println(obj.div());  
   
	}

	//methods
	//with parameter and with return type
	
	public int add(int a,int b)
	{
	 return a+b; //the value will be return to the main method
	}
	
	
	//Method with parameters and without return type
	
	  int x=15,y = 5;
	
	  public void sub()
	  
	 {
	   System.out.println("Substarction: "+(x-y)) ;
	 }
	  
	  
	// method with parameter without return type
	  
	  public void multi(int c,int d)
	
	  {
		  System .out.println("Multiplication: "+(c*d))	;
      }
	  
	  // method without parameter and with return type..
	  
	   public int div()
	   {
		   return x/y;
		   
	   }
	  
}
