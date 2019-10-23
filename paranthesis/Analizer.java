package paranthesis;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Stack;

public class Analizer {

	Stack stack = new Stack();
	ArrayList list = new ArrayList();
	ArrayList<Equation> equations = new ArrayList<Equation>();
	File file;
	
	public Analizer(File file) throws FileNotFoundException {
		this.file = file;
		Reader.toString(file, equations);
	}
	
	public void analizeAll() {
		for(Equation eq : equations) {
			eq.isBalanced = analize(eq);
		}
	}
	

	public boolean analize(Equation eq) {
		try {
			for(int i=0; i<eq.s.length(); i++) {
				if(eq.s.charAt(i) == '(') {
					stack.push((int) eq.s.charAt(i));
				}else if(eq.s.charAt(i) == ')') {
					stack.pop();
					
				}
			}
		}catch(EmptyStackException e) { 
			return false;
		}
		
		return stack.empty();
		
	}
	
	public void display() {
		for(Equation eq : equations) {
			System.out.println("Equation "+(eq.equationID+1)+" balanced- "+eq.isBalanced);
		}
	}

}

class Equation{
	int equationID;
	String s;
	boolean isBalanced;
	
	Equation(int equationID, String s){
		this.equationID = equationID;
		this.s = s;
	}
}
