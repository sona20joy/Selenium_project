package accessmodifierpkg;

public class Sample {

	public static void main(String[] args) {
		
		
		Accessmodifierprgm obj =new Accessmodifierprgm();

		// System.out.println("Private variable : "+obj.a);   a  is a private variable so not access here

		 System.out.println("Default variable : "+obj.b);

		 System.out.println("Protected variable :"+obj.c);

		 System.out.println("Public variable :"+obj.d);


	}

}
