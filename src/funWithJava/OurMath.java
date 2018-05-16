package funWithJava;

public class OurMath {
	
	public int accumulator = 0;

	public float sum(float a, float b) {
		return a + b;
	}
	
	public float multiply(float a, float b) {
		return a * b;
	}
	
	public float divide(float a, float b) {
		return a / b;
	}
	
	public void add(int a) {
		accumulator += a;
	}
	
	public boolean isFloat(float sum) {
		float sumFloat = sum;
		int sumInt = (int)sum;
		float result = sumFloat - sumInt;
		if (result != 0) {
			return true;
		} else {
			return false;
		}
	}

}
