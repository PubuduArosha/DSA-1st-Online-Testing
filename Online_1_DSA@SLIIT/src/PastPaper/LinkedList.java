package PastPaper;

public class LinkedList {
	
	Item first;

	public LinkedList() {
		first = null;
	}

	public void insertFirst( int item , double unitP ) {
		Item ii = new Item(item , unitP);
		ii.next = first;
		first = ii;
	}
	
	public double offerDiscount( double unitP ) {
		double dis;
		
		if ( unitP > 1500 ) {
			dis = unitP * ( 5.0 / 100 );
			System.out.println("Unit price : " + unitP );
			System.out.println("Unit price for Discount : " + dis );
			return dis;
		}
		else {
			System.out.println("Unit price : " + unitP );
			System.out.println("No Discount");
			return -99;
		}
	}
	
	
	
	
}
