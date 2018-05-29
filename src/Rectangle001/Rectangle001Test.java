package Rectangle001;

public class Rectangle001Test {

	public static void main(String[] args) {
		Rectangle001 r1= new Rectangle001();
		r1.setWidth(33.56f);
//		r1.getWidth();
		System.out.printf("The width of rectangle: %.2f.\n", r1.getWidth());
		r1.setLength(56.12f);
//		r1.getLength();
		System.out.printf("The length of rectangle: %.2f.\n", r1.getLength());
//		r1.getArea();
		System.out.printf("The area of the rectangle: %.4f.\n", r1.getArea());
		System.out.printf("The perimetr of the rectangle: %.4f.\n", r1.getPerimetr());
//		r1.toString();
		System.out.println(r1.toString());
		
	}

}
