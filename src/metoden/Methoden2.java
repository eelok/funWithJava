package metoden;

public class Methoden2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for(int i = 1; i <= 10; i++ ) {
		// gegenerErstelle();
		// }
		erstelleGegner("Lala", 90);
		erstelleGegner("Olaf", 190);

	}

	// public static void gegenerErstelle() {
	// String gegnerName = "Olaf";
	// int gegenerLeben = 100;
	// System.out.println("Gegner wurder erstellt");
	// }

	public static void erstelleGegner(String name, int lebenspunke) {
		String gegnerName = "name";
		int gegenerLeben = lebenspunke;
		System.out.println("Gegener wurde erstellt " + gegnerName + " LP " + lebenspunke);

	}

}
