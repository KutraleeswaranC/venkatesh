package org.java;
import java.util.Scanner;
public class AgeCalculator {	
//Take input of age of 3 people by user and 
//determine oldest and youngest among them.
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Venkatesh Age : ");
		int venkatesh = sc.nextInt();
		System.out.println("Venkatesh Age is : " + venkatesh);
		
		System.out.println("Yuvaraj Age : ");
		int yuvaraj = sc.nextInt();
		System.out.println("yuvaraj Age is : " + yuvaraj);
		
		System.out.println("kutra Age : ");
		int kutra = sc.nextInt();
		System.out.println("kutra Age is : " + kutra);
		sc.close();
		/*  venkatesh   10 15 20
			yuvaraj	    15 20 10	
			kutra	    20 10 15
		 */
		if( venkatesh < yuvaraj && venkatesh < kutra ) {
			System.out.println("THE YOUNGEST AGE IS venaktesh");
		}
			else if( yuvaraj < venkatesh && yuvaraj < kutra) {
				System.out.println("THE YOUNGEST AGE IS yuvaraj");
			}
				else
					System.out.println("THE YOUNGEST AGE IS KUTRA");
			
		
		if( venkatesh > yuvaraj && venkatesh > kutra ) {
			System.out.println("THE OLDEST AGE IS venkatesh");
		}
			else if( yuvaraj > venkatesh && yuvaraj > kutra) {
				System.out.println("THE OLDEST AGE IS yuvaraj");
			}
				else
					System.out.println("THE OLDEST AGE IS KUTRA");	
	}

}
