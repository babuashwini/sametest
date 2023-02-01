package orghcl;

import nsenmf.bankdetails;

public class AccounData {
	
	public void add() {
		System.out.println("addr in chennai");

	}
	
	private void str() {
		System.out.println("enter street name");

	}
	
	private void pin() {
		System.out.println("user pincode is 600054");
}
	public static void main(String[] args) {
		AccounData v=new AccounData();
		v.add();
		v.pin();
		v.str();
		
		CreateAccount abc= new CreateAccount();
		abc.userName();
		abc.password();

		bankdetails bak=new bankdetails();
		
	
		
				
	}

	}

	
