package org.polymorphism;
public class OverLoading {	
	
	public void subject(int i, int j) {
		
		System.out.println("Subject tamil mark is : " + i);
		System.out.println("Subject eng mark is : " + j);
		
	}
	public void subject(int i) {
		System.out.println("yuvaraj maths mark is : " + i);
		
	}
	public static void main(String[] args) {
		
		OverLoading obj = new OverLoading();
		
		obj.subject(100, 80);
		obj.subject(75);
		
	}
	

}
