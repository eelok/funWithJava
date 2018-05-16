package funWithJava;

import java.util.Scanner;

public class Lesson1 {

	public static void main(String[] args) {
		Glass glass1 = new Glass("Glass 1");
		glass1.addWater(500);
		printGlassState(glass1);
		glass1.addWater(200);
		printGlassState(glass1);
		glass1.giveWater(100);
		printGlassState(glass1);
		Glass glass2 = new Glass("Glass 2");
		glass2.addWater(100);
		printGlassState(glass2);
	}
	
	public static void printGlassState(Glass glass) {
		System.out.println(glass.name + " contains about " + glass.waterAccumulator + " ml");
	}
	
}
