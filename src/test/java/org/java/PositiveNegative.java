package org.java;
import java.util.Scanner;
public class PositiveNegative {

// get a number from the user to validate 
// Whether its negative number (or) positive number (or) zero

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your value : ");
		
		int value = sc.nextInt();
			System.out.println("The value is : " + value);
			sc.close();
		
		if( value == 0) {
			System.out.println("The given value is Zero");
		}
			else if( value > 0) {
				System.out.println("The given value is Positive");
			}
				else if( value < 0) {
					System.out.println("The given value is Negative");
				}
	}
}
