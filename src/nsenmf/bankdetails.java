package nsenmf;

import orghcl.AccounData;

public class bankdetails {
	
	private void username() {
		System.out.println("enter the user name");
		
}
	
	
	private void accountnumbar() {
		System.out.println("enter the acccountnumber");

	}
	
	private void addr() {
		System.out.println("addr in chennai");

	}
	
	private void pin() {
		System.out.println("user pincode is 602024");

	}
	
	public static void main(String[] args) {
		
		bankdetails bak=new bankdetails();
		
		bak.username();
		bak.accountnumbar();
		bak.addr();
		bak.pin();
		
		AccounData abc=new AccounData();
		
	}
	
	
}
