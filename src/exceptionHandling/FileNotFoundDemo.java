package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileNotFoundDemo {
	public static void main(String[] args) throws IOException {
		//C:\Users\TBHAUSAH\eclipse-workspace\TrainingAssignmentJava\src\exceptionHandling\notes.txt
		System.out.println("Program starts");
		try {
			FileInputStream fis= new FileInputStream("C:\\Users\\TBHAUSAH\\eclipse-workspace\\TrainingAssignmentJava\\src\\exceptionHandling");
			//System.out.println(fis.read());
		} catch (FileNotFoundException e) {
		System.out.println(e);
			}
		System.out.println("Program ends");
	}
}
