package task;

import java.util.Scanner;

public class Stringarraypgm {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the number of names: ");
	        int n = sc.nextInt();

	        String[] names = new String[n];

	        System.out.println("Enter the names:");

	        for (int i = 0; i < n; i++) {
	            names[i] = sc.next();
	        }

	        System.out.println("Names are:");

	        for (int i = 0; i < n; i++) {
	            System.out.println(names[i]);
	        }

	        sc.close();
	    }
	

	}


