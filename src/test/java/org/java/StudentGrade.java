package org.java;

import java.util.Scanner;

public class StudentGrade {
	
	/*2. A school has following rules for grading system:
   		a. Below 35 - F
   		b. 35 to 45 - E
   		c. 45 to 50 - D
		d. 50 to 60 - C
   		e. 60 to 80 - B
   		f. 80 to 100- A
		Ask user to enter marks and print the corresponding grade.
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
			System.out.println("Please enter your mark : ");
			
			int mark = sc.nextInt();
				System.out.println("The student mark is : " + mark);
				sc.close();
		if( mark < 100 && mark > 80 ) {
			
			System.out.println("A");
		}
			else if( mark < 80 && mark > 60) {
				System.out.println("B");
			}
				else if( mark < 60 && mark > 50) {
					System.out.println("C");
				}
					else if( mark < 50 && mark > 45) {
						System.out.println("D");
					}
						else if( mark < 45 && mark > 35) {
							System.out.println("E");
						}
							else if(mark < 35) {
								System.out.println("Fail");
							}
								else
									System.out.println("inValid number : please enter 1 -100");		
	}
}
