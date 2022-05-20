package inheritence;

public class Bank {
	
	public void display(String name, String address) {
		String address1= address;
		System.out.println("User: "+name+" "+"Address: "+ address);
	}
	
	public void rateofInterest(double r) {
		if(r<12) {
			System.out.println("Rate of interest applied is 12 %");
		}
		else {
			System.out.println("Revice rate of interest");
		}
	}
	public void principle(double p){
		if(p<=100000) {
			System.out.println("low princliple value");
		}
		else if(p>100000) {
			System.out.println("moderate principle value");
		}
	}
	public void loan(double salary) {
		if(salary>25000) {
			System.out.println("Eligible for loan < 10,00,000");
		}
		else if(salary >=25000) {
			System.out.println("Eligible for loan < 15,00,000");
		}
	}


}
