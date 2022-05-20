package exceptionHandling;

import java.io.File;
import java.io.IOException;

public class IOExceptionDemo {
	public static void main(String[] args) {
		File file= new File("notes.txt");
		System.out.println("Program starts");
		try {
			System.out.println(file.getCanonicalPath());
		}catch(IOException ex) {
			System.out.println(ex);
		}
		System.out.println("Program ends");
	}
}
