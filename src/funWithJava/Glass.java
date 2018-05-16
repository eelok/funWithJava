package funWithJava;

public class Glass {
	
	public int waterAccumulator = 0;
	public String name = "";
	
	public Glass(String name) {
		this.name = name;
	}
	
	public void addWater(int amountOfWater) {
		waterAccumulator += amountOfWater;
	}
	
	public void giveWater(int amountOfWater) {
		waterAccumulator -= amountOfWater;
	}
	
}
