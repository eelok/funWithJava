package calculator;

public class Calculation {

	public static void main(String[] args) {
		Operationes number = new Operationes();
		System.out.print("Insert a number: ");
		double a = number.getNumberFromConsole();
		System.out.print("Insert another number: ");
		double b = number.getNumberFromConsole();
		double substractionNum = number.subtraction( a, b);
		System.out.println(a + " - " + b + " - " + " = "  + substractionNum);

	}
	
//	public static void message(String message) {
//		System.out.print("Insert a number: ");
//		System.out.print("Insert another number: ");
//	}
	
}
