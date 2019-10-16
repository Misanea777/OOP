package project3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Options {

	private static File file;
	private static StringBuilder s = new StringBuilder();
	private static ArrayList<String> words = new ArrayList<String>();
	
	public Options(File file) throws FileNotFoundException {
		this.file = file;
		Reader.toString(file, s, words);
	}
	
	public static void giveNumberOfSentences(){
		
		int count = s.toString().split("[!?.]+").length;
		System.out.println("Number of sentences --> "+count);
	}
	
	public static void giveNumberOfWords() {
		
		System.out.println("Numer of words --> "+words.size());
		
	}
	
	public static void giveNumberOfLetters() {
		int lettersNumber = 0;
		int vowelsNumber = 0;
		int consonantsNumber = 0;
		for(String s : words) {
			vowelsNumber += Utilities.countVowelsRegex(s);
			consonantsNumber += Utilities.countConsonantsRegex(s);

		}
		lettersNumber = vowelsNumber + consonantsNumber;
		System.out.println("Number of letters --> "+lettersNumber+",  Number of vowels --> "+vowelsNumber+",  Number of consonants --> "+consonantsNumber);
	}
	
	
	public static void displayText() {
		for(int i=0; i<s.length(); i++) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
	}
	
	public static void displayWords() {
		for(String s : words) {
			System.out.println(s);
		}
	}
	
	
	
	public static void giveTopWords() {
		Collections.sort(words);
		ArrayList<Remember> r = new ArrayList<Remember>();
		ArrayList<String> temp = new ArrayList<String>(words); 
		while(temp.size()!=0) Utilities.find(temp, r);
		
		System.out.print("\n"+"The 5 most encountered words:"+"\n");
		Collections.sort(r);
		for(int i=0;i<r.size() & i<5;i++) {
			 System.out.println(r.get(i).word+" - "+(r.get(i).numberOfEncounters+1)+" encounters");
		}
	}
	
	public static void giveTheLongestWord() {
		String longestWord = "";
		for(String s : words) {
			if(s.length() > longestWord.length()) {
				longestWord = s;
			}
		}
		System.out.println("The longest word --> "+longestWord);
	}
}



