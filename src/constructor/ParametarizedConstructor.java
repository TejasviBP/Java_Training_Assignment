package constructor;

public class ParametarizedConstructor {

	
	ParametarizedConstructor(){
		System.out.println("Default constructor called");
		
	}
	
	ParametarizedConstructor(String name){
		System.out.println("Parametarized constructor called");
		System.out.println("Name "+ name);
	}
	
	public static void main(String[] args) {
		
		ParametarizedConstructor pc = new ParametarizedConstructor();
		
		ParametarizedConstructor pc1= new ParametarizedConstructor("Jack");

	}

}
