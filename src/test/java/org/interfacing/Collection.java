package org.interfacing;

public interface Collection {
	
	/*
	 * 1.we can't create an object for the interface
	 * 2.we can't create a normal method
	 * 3.we can create only abstract method
	 * 4.we can't write a business logic inside the abstract method
	 */
	
	public abstract void list();
	public abstract void set();
	public abstract void map();

}
