package org;

public class Company {
	private void compname() {
		System.out.println("company in moderbread ");

	}
	
	private void companyaddr() {
		System.out.println("enter the company addr");

	}

	private void pin() {
		System.out.println("pincode is 54601");

	}
	
	public static void main(String[] args) {
		Company c=new Company();
		c.compname();
		c.companyaddr();
		c.pin();
	}
}
