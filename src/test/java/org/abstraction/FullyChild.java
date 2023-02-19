package org.abstraction;

public class FullyChild implements FullyParent{

	public void stuName() {
		// TODO Auto-generated method stub
		System.out.println("StudName is : venkat");
	}

	public void tamil() {
		// TODO Auto-generated method stub
		System.out.println("Tamil mark is : PASS");
	}

	public void english() {
		// TODO Auto-generated method stub
		System.out.println("English mark is : PASS");
	}

	public void maths() {
		// TODO Auto-generated method stub
		System.out.println("Maths mark is : PASS");
	}

public static void main(String[] args) {
	
	FullyChild obj = new FullyChild();
	
	obj.stuName();
	obj.tamil();
	obj.english();
	obj.maths();
	
}	
}
