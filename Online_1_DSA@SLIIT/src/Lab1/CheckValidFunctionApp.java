package Lab1;

import java.util.Scanner;

public class CheckValidFunctionApp {

	public static void main(String[] args) {
		
		CheckValidFunction ckf = new CheckValidFunction(20);
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter Fuction : ");
		String ex = s.next();
		
		for ( int c = 0 ; c < ex.length() ; c++ ) {
			if( ex.charAt(c) == '(' ) {
				ckf.push(ex.charAt(c));
			}
			else if(ex.charAt(c) == ')' ) {
				ckf.pop();
			}
		}
		
		if( ckf.isEmpty() ) {
			System.out.println("Valid Function");
		}
		else {
			System.out.println("Invalid Function");
		}
		
	}

}
