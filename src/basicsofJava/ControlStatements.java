package basicsofJava;

public class ControlStatements {

	public static void main(String[] args) {

		String fruit="Jerry";
		switch(fruit) {
		case "Apple":
			System.out.println("Apple");
			break;
		case "orange":
			System.out.println("Orange");
			break;
		case "Strawberry":
			System.out.println("Strawberry");
			break;
		case "Mango":
			System.out.println("King of fruits");
			break;
			default: 
				System.out.println("Fruit is not in list");
		}

	}

}
