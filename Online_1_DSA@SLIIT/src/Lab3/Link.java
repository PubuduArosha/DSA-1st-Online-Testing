package Lab3;

public class Link {

	public String name;
	public Link next;
	double average;
	
	public Link( String n , double a ) {
		name = n;
		next = null;
		average = a;
	}
	
	public void displayDetails() {
		System.out.print("Name : " + name );
		System.out.println("\tAverage : " + average );
	}
	
}
