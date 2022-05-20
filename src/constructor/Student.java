package constructor;
//Example of COnstructor overloading

public class Student {
	
	public Student() {
		System.out.println("Printing Student details: ");
		System.out.println();
	}

	public Student(String name, int rollno) {
		System.out.println("Student details: ");
		System.out.println("Name: "+name+" Roll no: "+rollno);
	}
	public Student(String name, int rollno, char division) {
		System.out.println("Student details: ");
		System.out.println("Name: "+name+" Roll no: "+rollno+" Division: "+division);
	}

	public static void main(String[] args) {
		Student sc= new Student();
		Student sc1= new Student("Rahi",5);
		Student sc2= new Student("Jack",6,'A');
	}



}
