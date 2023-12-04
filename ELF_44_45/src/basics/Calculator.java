package basics;

public class Calculator {

	public double add(double...ref) {
		double sum = 0;
		for(double a : ref) {
			sum = sum + a;
		}
		return sum;
	}
	
	public int sub(int a, int b) {
		return a-b;
	}
}
