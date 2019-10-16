package mainp;


public class mainclas  {
	

	
	public static void main(String[] args) {
		
		Monitor m1 = new Monitor();
		Monitor m2 = new Monitor();
		m1.setParameters("red", 11.2f, 42.5f);
		m2.setParameters("blue", 15.2f, 12.5f);
		if(m1.getColor().equals(m2.getColor())) System.out.print("same color");
		
		
		Univer u1=new Univer("TUM",1994,10);
		Univer u2=new Univer("ASEM",1921,4);
	    Univer u3=new Univer("ULIM",1994,244);
	    Student s1 = new Student("John",16,7.8f);
	    Student s3 = new Student("Alex",16,8.8f);
	    Student s2 = new Student("Dan",16,10f);
	    Univer u4 = new Univer(s1,s2,s3, "UTM",1952);
//		for(int i=0;i<u1.students.size();i++) {
//			System.out.print(u1.students.get(i).name+"\n");
//			
//		}
		
		float media = (float) Univer.media(u4.students);
		System.out.print(media);
	}
		
	}

