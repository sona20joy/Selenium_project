package abstarctionprgm;

abstract class Parent  //abstarct class 

{
	abstract public void display(); // Method without implementation
	
	public void normalmethod() //Method with implementation
	
	{
		System.out.println("Normal method");
	}

}

class Child extends Parent 
{

	@Override
	public void display() {   //overriding abstract method 
		// TODO Auto-generated method stub
		
	}
	
}
public class Abstractionbasic {
	

	public static void main(String[] args) {
		Child obj =new Child();
		obj.display(); // calling method using child class object
		obj.normalmethod(); //calling normal using child class object

	}

}
