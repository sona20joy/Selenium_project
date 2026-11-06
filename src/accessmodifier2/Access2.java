package accessmodifier2;

import accessmodifierpkg.Accessmodifierprgm;

public class Access2 extends Accessmodifierprgm {   //Access2 is the child class of Accessmodifierprgm

	public static void main(String[] args) {
		Access2 obj = new Access2();
		
		 //System.out.println("Private variable : "+obj.a);  a is a private variable it cannot be accessed here

		// System.out.println("Default variable : "+obj.b);  b is a default variable it cannot be accessed here

		System.out.println("Protected variable :"+obj.c);    

		System.out.println("Public variable :"+obj.d);
	
		

	}

}
