package Bruch;

public class BruchTest {

	public static void main(String[] args) {
		
		Bruch bruchA = new Bruch(2, 3);
		Bruch bruchB = new Bruch(3, 4);
		bruchA.print();
		bruchB.print();
	
		bruchA.mal(bruchB).print();
		bruchA.geteilt(bruchB).print();
		bruchA.plus(bruchB).print();
		bruchA.minus(bruchB).print();
	}
}
