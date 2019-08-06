package Lab1;

public class StackApp {

	public static void main(String[] args) {
		Stack s = new Stack(5);
		
		s.push(1);//0
		s.push(2);//1
		s.push(3);//2
		s.push(4);//3
		s.push(5);//4
		//s.push(6);
		
		while ( !s.isEmpty() ) {
			int val = s.pop();
			System.out.print(val + " ");
		}

	}

}
