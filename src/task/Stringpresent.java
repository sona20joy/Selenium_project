package task;

import java.util.Scanner;

public class Stringpresent {

	public static void main(String[] args) {
		
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();

	        if (str.contains("morning"))
	            System.out.println("Morning is present");
	        else
	            System.out.println("Morning is not present");
	    }
	}
	


