package org.typesOfVariable;

public class InstanceVariable {
	
int a,b ;
	public void add() {
		a = 10 ;
		b = 20 ;
		int c =a + b ;
		System.out.println(c);
	}
	
	public void sub() {
		a = 100 ;
		b = 200 ;
		float c = a - b ;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		InstanceVariable obj = new InstanceVariable();
		
		obj.add();
		obj.sub();	
	}

}
