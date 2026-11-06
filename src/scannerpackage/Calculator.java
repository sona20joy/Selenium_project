package scannerpackage;

import java.util.Scanner;

public class Calculator { 

	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) {
			int a,b;
			char e;
			System.out.println("Enter two numbers");
			 a=sc.nextInt();
			 b=sc.nextInt();
			 System.out.println("Choose an operation +,-,/,*");
			 e=sc.next().charAt(0);
			 
			 switch(e)
			 {
			 case '+':System.out.println(a+b);
			 break;
			 
			 case '-':System.out.println(a-b);
			 break;
			 
			 case'*':System.out.println(a*b);
			 break;
			 
			 case '/':System.out.println(a/b);
			 break;
			 
			 default: System.out.println("ERROR");
			 
			 
			 }
		}
	}
	
}

