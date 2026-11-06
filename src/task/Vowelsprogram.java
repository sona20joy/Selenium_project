package task;

import java.util.Scanner;

public class Vowelsprogram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine();
        
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = Character.toLowerCase(word.charAt(i));

            if ("aeiou".contains(String.valueOf(ch))) {
                count++;
            }
        }

        System.out.println("Vowels: " + count);


	}

}
