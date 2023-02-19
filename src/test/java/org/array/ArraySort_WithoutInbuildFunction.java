package org.array;

public class ArraySort_WithoutInbuildFunction {
	
	//https://linuxhint.com/sort-array-in-java-without-using-sort-method/#:~:text=For%20sorting%20an%20array%20without,and%20most%20efficient%20sorting%20methods.
	public static void main(String[] args) {
		
		int [] array = new int[] {3,6,4,5};
		for(int i = 0 ; i < array.length ; i++) {
			for(int j = i + 1 ; j < array.length ; j++) {
				int temp = 0 ;
				if(array [i] > array [j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp ;
				}
			}
		}
		for(int i = 0 ; i < array.length ; i++) {
			System.out.println(array[i]+",");
		}
	}

}
