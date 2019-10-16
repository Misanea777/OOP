package project2;

public class Box {
	
	int height;
	int width;
	int depth;
	
	public Box() {
		height=1;
		width=1;
		depth=1;
	}
	
	public Box(int lenght) {
		height=lenght;
		width=lenght;
		depth=lenght;
	}
	
	public Box(int height,int width,int depth) {
		this.height=height;
		this.depth=depth;
		this.width=width;
	}
	
	public int getSurface() {
		return height*depth*2+height*width*2+depth*width*2;
	}
	
	public int getVolume() {
		return height*width*depth;
	}

}
