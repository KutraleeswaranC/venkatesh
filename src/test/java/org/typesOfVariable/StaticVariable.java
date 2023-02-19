package org.typesOfVariable;

public class StaticVariable {
	
	static String d;
	public void add() {
		d = "venkat" ;
		
		System.out.println("Inside the method : " + d);
	}
	
	public static void main(String[] args) {
		
		StaticVariable obj = new StaticVariable();
		System.out.println("The static d : " + d);
		obj.add();
	
	}
}
