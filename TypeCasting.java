package Practice1;

import java.util.Scanner;

public class TypeCasting {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int i=scan.nextInt();
		float f=i;
		
		System.out.println("Int value "+i); 
        System.out.println("Float value" +f); 
        scan.close();
	}

}
