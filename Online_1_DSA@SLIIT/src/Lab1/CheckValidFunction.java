package Lab1;

public class CheckValidFunction {

	int top;
	int maxSize;
	char stackArray[];
	
	public CheckValidFunction(int s) {
		top = -1;
		maxSize = s;
		stackArray = new char[s];
	}
	
	public void push(char k) {
		if ( top == maxSize-1 ) {
			System.out.println("Stack is full");
		}
		else {
			stackArray[++top] = k;
		}
	}
	
	public int pop() {
		if ( top == 0 ) {
			System.out.println("Stack is empty");
			return '0';
		}
		else {
			return ( top-- );
		}
	}
	
	public boolean isEmpty() {
		return ( top == -1 );
	}
	
	public boolean isFull() {
		return ( top == maxSize-1 );
	}
}
