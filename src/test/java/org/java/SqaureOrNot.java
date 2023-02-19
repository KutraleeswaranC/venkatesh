package org.java;

import java.util.Scanner;

public class SqaureOrNot {

public static void main(String[] args) {

	// len & breadth  square or not ?
	
	Scanner sc = new Scanner(System.in);
	
		System.out.println("Please give a length : ");
	int length = sc.nextInt();
		System.out.println("user given length is : " + length);
	
		System.out.println("Please give a breadth : ");
	int breadth = sc.nextInt();
		System.out.println("user given breadth is : " + breadth);
		sc.close();

		if ( length == breadth) {
			System.out.println("it\'s square");
		}
			else
				System.out.println("not square");
	}
}
