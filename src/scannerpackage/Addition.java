package scannerpackage;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		int a,b;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter two numbers");
			a=sc.nextInt();
			b=sc.nextInt();
		}
		
		System.out.println(a+b);
		

	}

}
