package task;

import java.util.Scanner;

public class Fib {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the term");
		int num=sc.nextInt();
		 int a=0,b=1;
		 
		 for(int i=1;i<=num;i++)
		 {
			System.out.println(a+" ");
		    int c=a+b;
		    a=b;
		    b=c;
	}

	}
	}


