package org.aModifierOne;

public class StaticVariable {
	
	static int a;
	public void sample() {
		
		a = 10 ;
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
		StaticVariable obj = new StaticVariable();
		obj.sample();
	}

}
