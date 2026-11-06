package javapractice;

import java.util.Scanner;

public class Factorialpgm {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		
		int num=sc.nextInt();		
		
		int factorial=1;
		
		{
			for(int i=1;i<=num;i++)
			{
				factorial=i*factorial;
				
			}
			
			System.out.println("factorial ="+factorial);
		}

	}

}
