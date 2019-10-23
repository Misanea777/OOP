package paranthesis;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Stack;

public class MainP {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("C:\\Users\\User\\Desktop\\misa.txt");
		
		Analizer analizer = new Analizer(file);

		 analizer.analizeAll();
		 analizer.display();

		
	}

}
