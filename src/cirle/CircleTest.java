package cirle;

public class CircleTest {

	public static void main(String[] args) {
		Circle shape1 = new Circle();
		shape1.getRadius();
		shape1.getArea();	
		Circle shape2 = new Circle(3.56);
		shape2.getRadius();
		shape2.getArea();
		Circle shape3 = new Circle(3.19, "orange");
		shape3.getColour();
		Circle shape4 = new Circle();
		shape4.setRadius(34.76);
		System.out.printf("The circle4 has radius %.4f.\n", shape4.getRadius());
		shape4.setColor("green");
		System.out.printf("The color of circle4 is: %s.\n", shape4.getColour());
		Circle shape5 = new Circle(5.0);
		System.out.println(shape5.toString());
		System.out.println(shape5);
		Circle shape10 = new Circle(3.33, "black");
		System.out.println(shape10.toString());

	}
}
