package orghcl;

public class CreateAccount { 
	
   
	public void userName() {
	
		
		System.out.println("enter the username");

	}

    public void password() {
       System.out.println("enter the password");
       
    }

    
    private void id() {
	   System.out.println("enter the id");

    }

     
        public static void main(String[] args) {

	        CreateAccount abc = new CreateAccount();
	  
	        abc.userName();
	        abc.password();
	        abc.id();
        
        AccounData v= new AccounData();
        v.add();
        }
        		
        }

















