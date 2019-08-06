package Lab3;

public class LinkList {

	public Link first;
	
	public LinkList() {
		first = null;
	}
	
	public void displayList() {
			
			Link current = first;
			while( current != null ) {
				current.displayDetails();
				current = current.next;
			}
			
			System.out.println(" ");
	
	}
	
	public void insertFirst(String name , double avarage ) {
		Link l = new Link( name , avarage );
		l.next = first;
		first = l;
	}
	
	public void deleteFirst() {
		if(first == null ) {
			System.out.println("LinkList is empty");
		}
		else {
			first.displayDetails();
			first = first.next;
		}
	}
	
	public boolean isEmpty() {
		return ( first == null );
	}
}
