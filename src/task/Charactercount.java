package task;

import java.util.Scanner;

public class Charactercount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        int count = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) != ' ') {
                count++; 
            }
        }

        System.out.println("Number of characters: " + count);
    }
}

