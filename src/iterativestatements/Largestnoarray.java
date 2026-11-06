 package iterativestatements;

import java.util.Scanner;

public class Largestnoarray {

	public static void main(String[] args) {
		int[]ar=new int[3];
		System.out.println("Enter the nubers");
		Scanner sc=new Scanner(System.in);
        for(int i=0; i<3; i++) {
        	  ar[i]=sc.nextInt();
        }
        int largest=0;
        for(int i=0;i<3;i++)
        {
        	if (ar[i]>largest) {
        		largest= ar[i];
        		
        	}
        }
        System.out.println("largest "+largest);
        
        
        		
	}

}
