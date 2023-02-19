package org.array;

public class OneDimenArray {
	
	
public static void main(String[] args) {
		
	//Declaring Array -  One dimensional Array
	
	int [] marks = {90,80,70,60,50};
	
	int length = marks.length;
	System.out.println("The mark array length is : " + length);
	
	for( int i = 0 ; i < length ; i++) {
		
		System.out.println("The marks values are : " + marks[i] );
	}
	
//	System.out.println("The mark value is : " + marks[0]);
//	System.out.println("The mark value is : " + marks[1]);
//	System.out.println("The mark value is : " + marks[2]);
//	System.out.println("The mark value is : " + marks[3]);
//	System.out.println("The mark value is : " + marks[4]);
	
	//ArrayIndexOutOfBoundsException
	//System.out.println("The mark value is : " + marks[5]);	
}
}
