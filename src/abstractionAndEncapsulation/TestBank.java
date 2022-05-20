package abstractionAndEncapsulation;

public class TestBank {
	
	// encapsulation means wrapping data into single unit
	// example : bank acct	
	public static void main(String[] args) {
		Bank obj = new Bank();
		obj.setAcctNO(89789988);
		obj.setId(77889999);
		obj.setName("XYZ  ");
	
	System.out.println("Account no :" +obj.getAcctNo());
	System.out.println("Name : "+obj.getName());
	System.out.println("Id: "+obj.getId());

	}

}
