package Bruch;

public class Bruch {
	
	private int zaehler;
	private int nenner;
	
	public Bruch() {
		this.zaehler = 1;
		this.nenner = 1;
	}
	
	public Bruch(int zaehler, int nenner) {
		this.zaehler = zaehler;
		this.nenner = nenner;
	}
	
	public Bruch mal(Bruch andereBruch) {
		int newZaehler = this.zaehler * andereBruch.zaehler;
		int newNenner = this.nenner * andereBruch.nenner;
		
		return new Bruch(newZaehler, newNenner).kuerzen();
	}
	
	public Bruch geteilt(Bruch andereBruch) {
		int newZaehler = this.zaehler * andereBruch.nenner;
		int newNenner = this.nenner * andereBruch.zaehler;
		
		return new Bruch(newZaehler, newNenner).kuerzen();
	}
	
	public Bruch plus(Bruch andereBruch) {
		int zaehlerVonBruch = this.zaehler * andereBruch.nenner;
		int zaehlerVonAndereBruch = andereBruch.zaehler * this.nenner;
		
		return new Bruch(zaehlerVonBruch + zaehlerVonAndereBruch, gemeinsameNenner(andereBruch)).kuerzen();
	}
	
	public Bruch minus(Bruch andereBruch) {
		int zaehlerVonBruch = this.zaehler * andereBruch.nenner;
		int zaehlerVonAndereBruch = andereBruch.zaehler * this.nenner;
		
		return new Bruch(zaehlerVonBruch - zaehlerVonAndereBruch, gemeinsameNenner(andereBruch)).kuerzen();
	}
	
	public void print(){
		System.out.println(this.zaehler + "/" + this.nenner);
	}
	
	public boolean istGroesser(Bruch andereBruch) {
		if(this.zaehler > andereBruch.zaehler) {
			return true;
		}
		return false;
	}
	
	public boolean istKleiner(Bruch andereBruch) {
		if(this.zaehler < andereBruch.zaehler) {
			return true;
		}
		return false;
	}
	
	public boolean istGleich(Bruch andereBruch) {
		if(this.zaehler == andereBruch.zaehler) {
			return true;
		}
		return false;
	}
	
	private int gemeinsameNenner(Bruch andereBruch) {
		return this.nenner * andereBruch.nenner;
	}
	
	private int ggT(int zahl1, int zahl2) {
		while(zahl1 !=0 && zahl2 != 0) {
			if(zahl1 > zahl2) {
				zahl1 = zahl1 % zahl2;
			} else {
				zahl2 = zahl2 % zahl1;
			}
		}
		int ggt = zahl1 + zahl2;
		return ggt;
	}
	
	private Bruch kuerzen() {
		int ggT = ggT(this.zaehler, this.nenner);
		return new Bruch(this.zaehler/ggT, this.nenner/ggT);
	}

}
