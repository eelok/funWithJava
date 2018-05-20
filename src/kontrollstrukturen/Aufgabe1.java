package kontrollstrukturen;

public class Aufgabe1 {
	
	public void printRow (int numberOfSymbols) {
		for (int i = 1; i <=numberOfSymbols; i++) {
			System.out.print("* ");
		}											
	}
	
	public void printRectangle(int width, int heigth) {		
		int row = 1; 							
		while (row <= heigth) {
			printRow(width);
			System.out.print("\n");
			System.out.print("\n");
			row ++;								
		}
	}
	
	public void printTriangleBack(int heigth) {
		int row = heigth;
		do {
			printRow(row);
			System.out.print("\n");
			System.out.print("\n");
			row--;
		} while (row >= 0);					
	}
	
	public void printTriangleStraight(int heigth) {	
		int row = 0;
		while (row <= heigth) {
			printRow(row);
			System.out.print("\n");
			System.out.print("\n");
			row++;
		}
	}
	
	public void printSandglass(int heigth) {
		int padding = 0;
		int width = heigth * 2 - 1;
		for (int row = heigth - 1; row >= 0; row--) {
			printRowWithPadding(width, padding++);
		}
		padding--;
		for (int row = 0; row < heigth - 1; row++) {
			printRowWithPadding(width, --padding);
		}  
	}

	public void printRowWithPadding(int width, int padding) {
		for (int i = 0; i < width; i++) {
			if (i < padding || i > (width - 1) - padding) {
				System.out.print(" ");
			} else {
				System.out.print("*");
			}
		}
		System.out.println();
	}
}
