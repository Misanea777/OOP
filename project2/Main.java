package project2;

public class Main {

	public static void main(String[] args) {
		Box b1 = new Box();
		Box b2 = new Box(4);
		Box b3 = new Box(2,3,4);
		
		System.out.println("the surface is - "+b3.getSurface());
		System.out.println("the volume is - "+b3.getVolume());

	}

}
