package paranthesis;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader {
	
	public static void toString(File file, ArrayList<Equation> equations) throws FileNotFoundException {
		
		Scanner console = new Scanner(file);
		
		 while(console.hasNextLine()) {
			 String z = console.nextLine();
			 String[] zip = z.split("\\n+");
			 for(int i=0;i<zip.length;i++) {
				 
				 equations.add(new Equation(equations.size(), zip[i]));
			 }
				 
		 }
		 console.close();
	}
	
		 
}
