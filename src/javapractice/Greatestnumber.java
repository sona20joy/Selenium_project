package javapractice;

import java.util.Scanner;

public class Greatestnumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for a and b");
        int a= sc.nextInt();
        int b= sc.nextInt();
        if (a>b)
        {
        	System.out.println("A is greater");
        }
        else
        {
        	System.out.println(" B is greatest number");
        	
        }
	}

}
