package abstractionAndEncapsulation;

//A Java class which has only getter methods. 

public class ReadOnlyDemo {
	private String organization="Capgemini";

	public String getCompany() {
		return organization;
	
}
	public static void main(String[] args) {
		 ReadOnlyDemo r=new ReadOnlyDemo();
		System.out.print(r.getCompany());
	//	r.setCompany(); gives error
	}
}


