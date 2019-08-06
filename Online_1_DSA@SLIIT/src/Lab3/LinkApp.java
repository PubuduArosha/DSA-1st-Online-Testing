package Lab3;

public class LinkApp {

	public static void main(String[] args) {
		
		Link l1 = new Link( "Nipuna" , 53.5 );
		Link l2 = new Link( "Aavinda" , 78.0 );
		Link l3 = new Link( "Prashani" , 69.5 );
		
		l1.next = l2;
		l2.next = l3;
		
		l1.displayDetails();
		l2.displayDetails();
		l3.displayDetails();

	}

}
