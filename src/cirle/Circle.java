package cirle;

public class Circle {
	
	private double radius;
	private String color;
	
	public Circle() {
		this.radius = 1.0;
		this.color = "red";
	}
	
	public Circle(double radius){
		this.radius = radius;
		this.color = "red";
	}
	
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	
	public String getColour() {
		return this.color;
	}
	
	
	public double getRadius() {
		System.out.printf("The radius of the circle: %.4f\n", this.radius);
		return radius;
	}
	public double getArea() {
		double pi = 3.1415;
		double area = this.radius * this.radius * pi;
		System.out.printf("The Area of the circle: %.4f.\n", area);
		return area;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		return "Circle[radius=" + this.radius + " color=" + this.color +"]";
	}
}
