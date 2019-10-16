package project3;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Utilities {
	
	public static int countVowelsRegex(String str) {
        int count = 0;
        if (str.length() > 0) {
                Pattern vowelPattern = Pattern.compile("[aeiouyw]");
                Matcher vowelMatcher = vowelPattern.matcher(str);
	                while (vowelMatcher.find()) 
                	count++;
        }
        return count;
}

public static int countConsonantsRegex(String str) {
    int count = 0;
    if (str.length() > 0) {
            Pattern vowelPattern = Pattern.compile("[qrtpsdfghjklzxcvbnm]");
            Matcher vowelMatcher = vowelPattern.matcher(str);
                while (vowelMatcher.find()) 
            	count++;
    }
    return count;
}
	
	public static void find(ArrayList<String> words, ArrayList<Remember> r) {
		int i=0;
		
		while(( words.size()>1) && words.get(i).equals(words.get(i+1))) {
			i++;
			if(i==words.size()-1) break;
		}
		
	    r.add(new Remember(words.get(i), i));
		for(int j=0;j<=i;j++) words.remove(0);
	}
	
	

}



class Remember implements Comparable<Remember>{  // class that remembers the words and their number of encounters
	String word;
	int numberOfEncounters;
	public Remember(String word, int numberOfEncounters) {
		this.word = word;
		this.numberOfEncounters = numberOfEncounters;
	}
	
	public int compareTo(Remember r) {
		return r.numberOfEncounters-this.numberOfEncounters;
	}
}
