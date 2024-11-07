package BasicPrograms;

import java.util.Arrays;

public class ArraySorting {
	public static void main(String[] args) {
		int[] sort = {22, 1, 32, 10, 39, 40};
		char[] sort2 = {'a', 'b', 'z', 'k', 'l'};
		
		Arrays.sort(sort);
		Arrays.sort(sort2);
		for(int i=sort.length-1; i>=0; i--) {
			System.out.println("Desending order" +sort[i]);
		}
		System.out.println("--------------------------------");
		
		for(int i=sort2.length-1; i>=0; i--) {
			System.out.println("Desending order" +sort2[i]);
		}
		System.out.println("------------Characters sorting--------------------");		
		
		
		Arrays.sort(sort);
		for(int i=0; i<sort.length; i++) {
			System.out.println("Assending order" +sort[i]);
		}
		
	}
}
