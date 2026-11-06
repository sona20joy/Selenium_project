package javapractice;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the mark");
		int mark = sc.nextInt();
		if (mark>=80)
		{
			System.out.println("A grade");
		}
		else if(mark>=70)
		{
			System.out.println("B grade");
		}
		else if(mark>=60)
		{
			System.out.println("C grade");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	

}
