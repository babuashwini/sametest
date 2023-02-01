package org;

public class Employee {
	public Employee() {
		System.out.println("enter the employee name");
	}
	
	private void age() {
		System.out.println("enter the age");

	}
	
	private void addr() {
		System.out.println("addr in chennai");

	}
	
	private void conctdetails() {
		System.out.println("enetr the employee contactdetails");

	}

	private void pin() {
		System.out.println("employee pincode is 600062");

	}
	public static void main(String[] args) {
		Employee e=new Employee();
		e.age();
		e.addr();
		e.conctdetails();
		e.pin();
	}
}
