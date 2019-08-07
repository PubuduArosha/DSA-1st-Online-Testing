package PastPaper;

import java.util.Scanner;

public class ItemApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double unitP;
		int item;
		
		LinkedList  ll = new LinkedList();
			
			for ( int k = 0 ; k < 3 ; k++ ) {
				System.out.print("Enter Intem No :");
				item = input.nextInt();
				
				
				System.out.print("Enter Unit Item No " + (item ) + " Price :");
				unitP = input.nextDouble();
				
				ll.insertFirst( item , unitP );	
				
				ll.offerDiscount( unitP );

			}
			
			

	}

}
