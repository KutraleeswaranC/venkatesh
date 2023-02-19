package org.abstraction;

public class PartialChildOne extends PartialParent{

	@Override
	public void result() {
		
		System.out.println
		("The 1st sem result is : Pass");
	}

	@Override
	public void course() {
		
		System.out.println
		("The 1st sem course is : General eng");
	}

	public static void main(String[] args) {
		PartialChildOne obj = new PartialChildOne();
		
		obj.stuName();
		obj.result();
		obj.course();
	}
	

}
