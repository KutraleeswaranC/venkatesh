package org.polymorphism;

public class OverridingChild extends OverridingParent {

	
	public void tamil(int i) {
		System.out.println
		("venkat 2nd sem tamil mark : " + i );
	}
	
	public void eng(int j) {
		System.out.println
		("venkat 2nd sem eng mark : " + j);
	}
	
	public void maths(int k) {
		System.out.println
		("venkat 2nd sem maths mark : " + k);
	}
	public void science(int t) {
		System.out.println
		("venkat 2nd sem science mark : " + t);
	}
	
	public static void main(String[] args) {
		OverridingChild obj = new OverridingChild();
		obj.name("venkat");
		obj.tamil(100);
		obj.eng(85);
		obj.maths(80);
		obj.science(95);
	}
}
