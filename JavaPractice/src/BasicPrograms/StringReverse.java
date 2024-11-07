package BasicPrograms;

import java.util.Scanner;

public class StringReverse {

	public static void  main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your string to reverse: ");
		String input = sc.nextLine();
		
		char letters[] = input.toCharArray();
		//System.out.println(letters.length); // use if we want to print the length of string.
		
		for(int i=letters.length-1; i>=0; i--) {
			System.err.print(letters[i]);
		}
	   sc.close();
	}
}
