package calculator;

import java.util.Scanner;

public class Operationes {
	

	
	public double getNumberFromConsole(){
		Scanner sc = new Scanner(System.in);
		double numDoub = sc.nextDouble();
		return numDoub;
	}
	
	public double subtraction(double num1, double num2) {
		return num1 - num2;
	}
	
	
}
