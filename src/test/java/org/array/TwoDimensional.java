package org.array;
public class TwoDimensional {

	public static void main(String[] args) {
		//DeclaringArray
//		int [] [] marks = { {10,20,30,40,50 },	
//							{50,40,30,20,10 } };
		//Creating Array
		
		int [] [] marks = new int [2][4];
		
		marks [0][0] = 50 ;
		marks [0][1] = 60 ;
		marks [0][2] = 70 ;
		marks [0][3] = 80 ;
		
		marks [1][0] = 80 ;
		marks [1][1] = 70 ;
		marks [1][2] = 60 ;
		marks [1][3] = 50 ;
		
		
		int len = marks.length;
		System.out.println("The array length is : " + len);
	
		for ( int i = 0 ; i < len ; i++ ) { 
			
			for (int j = 0 ; j < marks[i].length ; j++) {
				
				System.out.println("The mark is : " + marks[i][j]);
			}
		}
		
//		System.out.println(marks[0][0]);
//		System.out.println(marks[0][1]);
//		System.out.println(marks[0][2]);
//		System.out.println(marks[0][3]);
//		//System.out.println(marks[0][4]);
//		System.out.println(" ");
//		System.out.println(marks[1][0]);
//		System.out.println(marks[1][1]);
//		System.out.println(marks[1][2]);
//		System.out.println(marks[1][3]);
//		//System.out.println(marks[1][4]);
		
		
		
		
		
		
		
		
	}
}
