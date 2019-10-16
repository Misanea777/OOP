package project3;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) throws FileNotFoundException  {
		Scanner in = new Scanner(System.in); 
		
		File file = new File("C:\\Users\\User\\Desktop\\misa.txt");
		Options options = new Options(file);

		
		int n=0;
		String s;
		while(n!=7) {
			n = in.nextInt();
				switch(n) {
				
				case 0:
					options.displayText();
					break;
				case 1:
					options.displayWords();
					break;
				case 2:
					options.giveNumberOfSentences();
					break;
				case 3:
					options.giveNumberOfWords();
					break;
				case 4:
					options.giveNumberOfLetters();
					break;
				case 5:
					options.giveTopWords();
					break;
				case 6:
					options.giveTheLongestWord();
					break;
				case 7:
					return;
				
				default:
					System.out.println("Invalid comand");
			}
				
		}
		

	}

}
