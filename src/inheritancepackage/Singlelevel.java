package inheritancepackage;

class Parent   //parent class
{
	int a=5;
	public void parentmethod()
	{
		System.out.println("parentmethod");
    }
}


   class Child extends Parent  //child class inherit the properties of class parent
{
	public void childmethod()
	
	{
		System.out.println("childmethod");
    }
}

public class Singlelevel {
	
        public static void main(String[] args) {
        	
        	Child obj=new Child();
        	System .out.println("Value of a:"+obj.a);
        	obj.parentmethod(); //calling parent class method using child class object
        	obj.childmethod();
        	
        	
		

	}

}
