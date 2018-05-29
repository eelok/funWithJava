package metoden;

public class Methoden {

	public static void main(String[] args) {
		ausgabe();
	}
	
	public static void ausgabe(){
		System.out.println("I am a metode");
		summe();
	}
	
	public static void summe() {
		int a,b, summe01;
		a = 6;
		b = 19;
		summe01 = a + b;
		System.out.println(summe01);
	}

}
