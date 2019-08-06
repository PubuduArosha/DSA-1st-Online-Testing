package Lab3;

public class LinkedListApp {
	public static void main(String[]args){
		LinkList ll = new LinkList();
		
		ll.insertFirst("Prashani", 69.5);
		ll.insertFirst("Aravinda", 78.0);
		ll.insertFirst("Nipuna", 53.5);
		
		
		System.out.println("Displaying List");
		ll.displayList();
		
		System.out.println();
		System.out.println("Delete Aravindra");
		ll.deleteLink("Nipuna");
		
		System.out.println();
		System.out.println("Display new List");
		ll.displayList();
		
	}
	
}
