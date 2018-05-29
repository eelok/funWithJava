package Bruch;

public class BruchTest {

	public static void main(String[] args) {
		
		Bruch bruchA = new Bruch(9, 15);
		Bruch bruchB = new Bruch(3, 5);
		bruchA.print();
		bruchB.print();
		
		System.out.println(" ");
		bruchA.mal(bruchB).print();
		bruchA.geteilt(bruchB).print();
		bruchA.plus(bruchB).print();
		bruchA.minus(bruchB).print();
		System.out.println(" ");

		System.out.println(bruchA.istGroesser(bruchA, bruchB));
		System.out.println(bruchA.istKleiner(bruchA, bruchB));
		System.out.println(bruchA.istGleich(bruchA, bruchB));
				
	}
}
