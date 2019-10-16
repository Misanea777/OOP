package mainp;

import java.util.ArrayList;
import java.util.Random;

public class Univer {
	public String name;
	public int foundationYear;
	public ArrayList<Student> students=new ArrayList();
	
	public Univer(String name,int year,int i) {
		this.name=name;
		foundationYear=year;
		students=createList(i);
	}
	
	public Univer(Student s1, Student s2, Student s3,String name, int year) {
		students.add(s1);
		students.add(s2);
		students.add(s3);
		this.name=name;
		year = foundationYear;
	}
	
	public static ArrayList createList(int n) {
		ArrayList<Student> students=new ArrayList();
		for(int i=0;i<n;i++) {
			students.add(new Student(createName(),i+3,i+6));
		}
		return students;
	}
	
	public static String createName() {
		ArrayList<String> name=new ArrayList();
		ArrayList<String> sname=new ArrayList();
		Random r=new Random();
		int n = r.nextInt(4);
		Random rr=new Random();
		int m=rr.nextInt(4);
		name.add("Jora");name.add("Ivan");name.add("Oleg"); name.add("Criste");name.add("Abdul");
		sname.add("Clopotel");sname.add("Topor");sname.add("Ghiocel"); sname.add("Krieg");sname.add("Alam");
		return(name.get(n)+" "+sname.get(m));
	}
	
	public static double media(ArrayList<Student> students) {
		
		double[] a = new double[students.size()];
		for(int i=0;i<students.size();i++) {
			a[i] = students.get(i).mark;
		}
		
		double m=0;
		for(int i=0;i<a.length;i++) m+=a[i];
		m=m/a.length;
		return m;
	}
}
