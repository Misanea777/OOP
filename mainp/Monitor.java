package mainp;

public class Monitor {
 private String color;
 private Float dimension;
 private Float res;
 
 public void setParameters(String color,Float dimension,Float res) {
	 this.color=color;
	 this.dimension=dimension;
	 this.res=res;
 }
 
 public String getColor() {return color;}
 public Float getDimens() {return dimension;}
 public Float getRes() {return res;}
}
