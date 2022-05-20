package abstractionAndEncapsulation;

public class WriteOnlyDEmo {
private String name;

 public String setName(String name) {
	return name;
	 // name= this.name;
 }
	
	public static void main(String[] args) {
		 WriteOnlyDEmo wr= new WriteOnlyDEmo();
		 System.out.print(wr.setName("XYZ"));
		
		
}
}
