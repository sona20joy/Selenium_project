package polymorphismpackage;

public class Staticfinal {
	int a =5;
	static String company= "Luminar";
	final double pi=3.14;
	static final double piValue=3.14;
	

	public static void main(String[] args) {
		Staticfinal obj=new Staticfinal();
		System.out.println("The value of a : "+obj.a);
		
		System.out.println("The value of company : "+company); // company is a static variable we can call without call an object
		company= "Luminar technolab"; // the value of static variable can updated
		System.out.println("new value:"+company);
		
		System.out.println("value of pi:"+obj.pi);
		// obj.pi=3.422  final variable cannot be modified 
		
		System.out.println("The avlue of piValue : "+piValue); //variable declared using 'static final keyword

	}

}
