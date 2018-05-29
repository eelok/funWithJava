package metoden;

public class BeispielMethoden {

	public static void main(String[] args) {
		int gegnerLeben = 100;
		System.out.println("Der Boss hat: " + gegnerLeben);
		gegnerLeben = gegenerHit(gegnerLeben);
		System.out.println("Boss getroffen hat noch: " + gegnerLeben + " Lebens Punkte");
		
		gegnerLeben = gegenerHit(gegnerLeben);
		System.out.println("Boss getroffen hat noch: " + gegnerLeben + " Lebens Punkte");
		
		gegnerLeben = gegenerHit(gegnerLeben);
		System.out.println("Boss getroffen hat noch: " + gegnerLeben + " Lebens Punkte");
	}
	
	
	public static int gegenerHit(int aktuelLeben) {
		int neuGegnerLeben;
		neuGegnerLeben = aktuelLeben - 20;
		return neuGegnerLeben;
	}

}
