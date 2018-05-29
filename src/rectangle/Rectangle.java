package rectangle;

import java.util.Scanner;

public class Rectangle {
	
	private double a = 0;
	private double b = 0;
	
	public Rectangle() {
		System.out.println("Hello from constructor. Object is created");
	}
	
	public Rectangle(double a, double b) {
		this.a = a;
		this.b = b;
		System.out.printf("Hello from constructor. Object is created, a = %s, b = %s \n", a, b);
	}
	
	public void setSideA(double width) {
		a = width;
	}
	
	public void setSideB(double heigth) {
		b = heigth;
	}
		
	public double getA() {
		return a;
	}
	
	public double getB() {
		return b;
	}
	
	public double perimeterOfRectangle() {
		double p = (a + b) * 2;
		return p;
	}
	
	public double squareOfRectangle() {
		double s;
		return s = a * b;
	}
	
	public boolean sidesEqual() {
		return a == b;
	}
	
}
