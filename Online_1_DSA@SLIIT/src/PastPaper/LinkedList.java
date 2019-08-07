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
	
	public void offerDiscount( ) {
		double dis;
		Item current = first;
		while ( current != null ) {
			if ( current.unitPrice > 1500 ) {
				dis = current.unitPrice * ( 5.0 / 100 );
				System.out.println("Unit price : " + current.unitPrice );
				System.out.println("Unit price for Discount : " + dis );
				System.out.println();
				current = current.next;
				break;
			}
			else {
				System.out.println("Unit price : " + current.unitPrice );
				System.out.println(1);
				System.out.println();
				current = current.next;
			}
			
		}
	}
	
	
	
	
}
