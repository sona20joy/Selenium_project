package polymorphismpackage;

public class Overloading {
   
	 public void add(int a,int b)
	 {
		 System.out.println("method 1:"+a+b);
	 }
	 
	
	 public void add(int a,int b,int c)
	 {
		 System.out.println("method 2: "+(a+b+c));
	 }
	 
	 
	
	 public void add(int a,double b)
	 {
		 System.out.println("method 3: "+(a+b));
	 }
	 
	 
	 
	 public void add(double a,double b)
	 {
		 System.out.println("method 4: "+(a+b));
	 }
	
	
	
	public static void main(String[] args) 
	{
		Overloading obj=new Overloading();
        obj.add(2, 5, 7);  
        obj.add(2.1,3);
        obj.add(4, 5);
        obj.add(4, 3.2);
	}

}
