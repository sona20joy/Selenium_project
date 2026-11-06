package javapractice;

import java.util.Scanner;

public class Scannerclasspracti {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.nextLine();
		
		Scanner sc1 =new Scanner(System.in);
		System.out.println("Enter your rollnum");
		int Rollnum=sc1.nextInt();
		
		
		Scanner sc3=new Scanner(System.in);
		System.out.println("Enter your address");
		String  address=sc3.nextLine();
		
		Scanner sc4=new Scanner(System.in);
		System.out.println("Enter your Weight");
		double weight = sc3.nextDouble();
		
		
		Scanner sc5=new Scanner(System.in);
		System.out.println("Enter your grade");
		char grade= sc4.next().charAt(0);  
				
		
		
		

	}

}
