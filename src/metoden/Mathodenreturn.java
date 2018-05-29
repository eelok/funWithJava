package metoden;

public class Mathodenreturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int summe = taschenRchnen(5, 5, '+');
		System.out.println(summe);

	}
	
	public static int taschenRchnen(int zahl1, int zahl2, char operator) {
		int summe;
		if(operator == '+') {
			 summe = zahl1 + zahl2;
		} else{
			 summe = zahl1 - zahl2;
		}
		return summe;
	}
	
	

}
