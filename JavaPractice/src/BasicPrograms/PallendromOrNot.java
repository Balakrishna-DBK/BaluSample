package BasicPrograms;

import java.util.Scanner;

public class PallendromOrNot {
  public static void main(String args[]) {
	  
	  Scanner sc =new Scanner(System.in);
	  System.out.println("Please enter the number: ");
	  int num = sc.nextInt();
	  
	  int rem=0;
	  int req=num;
	  while(num>0) {
		  int temp=num%10;
		  rem=rem*10+temp;
		  num/=10;
	  }if(req==rem) {
		  System.out.println("Its pallendrom: ");
	  }else {
		  System.out.println("Not pallendrom: ");
	  }
	sc.close();	    
  }
}
	