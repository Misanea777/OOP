package project3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader {
	
	public static void toString(File file, StringBuilder s, ArrayList<String> words) throws FileNotFoundException {
		
		Scanner console = new Scanner(file);
		 while(console.hasNextLine()) {
			 String z = console.nextLine();
			 String[] zip = z.split("((\\.+)?(\\s+(\\.+)?))|(\\.+)|(\\,)(\\s+)?");
			 for(int i=0;i<zip.length;i++) {
				 words.add(zip[i].toLowerCase());
			 }
			 for(int i=0;i<z.length();i++) {
				 s.insert(s.length(),z.charAt(i));
			 }
		 }
		 console.close();
	}
	
		 
}
