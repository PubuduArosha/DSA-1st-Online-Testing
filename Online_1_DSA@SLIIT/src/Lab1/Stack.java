package Lab1;

public class Stack {

	//int nItems;
	int top;
	int maxSize;
	int stackArray[];
	
	public Stack ( int s ) {
		maxSize = s;
		stackArray = new int[s];
		//nItems = 0;
		top = -1;
	}
	
	public void push( int k ) {
		if ( top == maxSize-1 ) {
			System.out.println("Stack is Full");
		}
		else {
			stackArray[++top] = k;
		}
	}
	
	public int pop() {
		if( top == 0 ) {
			System.out.println("Stack is Empty");
			return -99;
		}
		else {
			//nItems--;
			return stackArray[top--];
		}
			
	}
	
	public void peek() {
		if( top == 0 ) {
			System.out.println("stack is Empty");
		}
		else
			System.out.println(top);
	}
	
	public boolean isEmpty() {
		return ( top == 0);
	}
	
	public boolean isFull() {
		return ( nItems == maxSize-1 );
	}
}
