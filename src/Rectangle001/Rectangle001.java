package Rectangle001;

public class Rectangle001 {
	
	private float length = 1.0f;
	private float width = 1.0f;
	
	public Rectangle001() {
		
	}
	
	public Rectangle001(float length, float width){
		this.length = length;
		this.width = width;
	}
	
	public float getLength() {
		return this.length;
	}
	
	public void setLength(float length) {
		this.length = length;
	}
	
	public float getWidth() {
		return width;
	}
	
	public void setWidth(float width) {
		this.width = width;
	}
	
	public double getArea() {
		return this.length * this.width;
	}
	
	public double getPerimetr() {
		return this.length + this.width *2;
	}
	
	public String toString() {
		return "Rectangle has width: " + this.width + "cm " + " and " + "length: " + this.length + "cm ";
	}
}
