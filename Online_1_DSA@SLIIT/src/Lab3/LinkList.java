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
	
	public Link deleteLink(String name) {
		if( first == null ) {
			System.out.println("LinkList is empty");
			return null;
		}
		else {
			Link previous = first;
			Link current = first;
			
				if ( current.name == name) {
					current.displayDetails();
					first = current.next;
					return current;
				}
				else{
					while ( current.name != name ) {
						previous = current;
						current = current.next;
						if(current.next == null)
							break;
					}
					
				}
				
			
				if(current.name == name) {
					current.displayDetails();
					previous.next = current.next;
					return current;
				}
				else {
					System.out.println("Cant find the linked array");
					return null;
				}
		}
	}
}
