package rectangle;

import java.util.Scanner;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle object = new Rectangle(
			getValueFromConsole("Insert any number: "), 
			getValueFromConsole("insert another number: ")
		);		
//		object.setSideA(getValueFromConsole("Insert any number: "));
//		object.setSideB(getValueFromConsole("insert another number: "));
		System.out.println("The width of rectangle is = " + format(object.getA()));
		System.out.println("The heigth of rectangle is = " + format(object.getB()));
		System.out.println("Perimeter of rectangle = " + format(object.perimeterOfRectangle()));
		System.out.println("Square of rectangle = " + format(object.squareOfRectangle()));
		if (object.sidesEqual()) {
			System.out.println("This rectangle is square");
		}

	}

	private static double getValueFromConsole(String message) {
		Scanner scanner = new Scanner(System.in);
		System.out.print(message);
		return scanner.nextDouble();
	}

	private static boolean isFractionalNumber(double val) {
		int sumInt = (int) val;
		double result = val - sumInt;

		return result != 0;
	}

	private static String format(double val) {
		if (isFractionalNumber(val)) {
			return String.format("%s", val);
		} else {
			return String.format("%s", (int)val);
		}
	}

}
