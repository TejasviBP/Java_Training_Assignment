package constructor;

public class DefaultConstructor {
	public  DefaultConstructor() {
		System.out.println("Default constructor called");
	}

	public void display() {
		
		System.out.println("display method called");
	}

	public static void main(String[] args) {

		DefaultConstructor dc= new DefaultConstructor(); // constructor invoke 
        dc.display();

	}

}
