package scannerpackage;

import java.util.Scanner;

public class ScannerInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter roll Number");
		int rn=sc.nextInt();
		
		System.out.println("Enter the Name");
		String n=sc.next();
		
		sc.nextLine();
		
		System.out.println("Enter Address");
		String ad=sc.nextLine();
		
		System.out.println("Grade");
		char g=sc.next().charAt(0);
		
		System.out.println("weight");
		double w =sc.nextDouble();
		
		System.out.println("roll number:"+rn);
		System.out.println("Name:"+n);
		System.out.println("address:"+ad);
		System.out.println("Grade:"+g);
		System.out.println("weight:"+w);
	}


		

	}


